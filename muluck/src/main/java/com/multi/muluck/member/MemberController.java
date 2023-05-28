package com.multi.muluck.member;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller


//@RequestMapping("member")
public class MemberController {

	@Autowired
	MemberDAO dao;
	
	//회원가입
	@RequestMapping("member/join")
	public void join(MemberVO bag) {
		System.out.println(bag);
		dao.join(bag);
//		return "member/join";
	}
	
	//로그인
	@RequestMapping(value = "member/login", method = RequestMethod.POST)
	@ResponseBody
	public boolean login(MemberVO bag, HttpSession session) {
		System.out.println(bag);
		MemberVO result = dao.login(bag);
		System.out.println("result : "+result);
		if(result != null) {
			session.setAttribute("member_no", result.getMember_no());
			session.setAttribute("member_id", result.getMember_id());//로그인 아이디 저장 기능 이용하기 위해
			session.setAttribute("member_nickname", result.getMember_nickname());
			//session.setAttribute("member_email", result.getMember_email());
			return true;
		}else {
			return false;
		}
    }
	
	// 네이버 로그인 (회원가입)
	@RequestMapping("member/naverLogin")
	public String naverLogin(MemberVO bag, HttpSession session) {
		MemberVO result = dao.naverIdCheck(bag.getMember_id());
		if (result != null) {
			session.setAttribute("member_no", result.getMember_no());
			session.setAttribute("member_nickname", result.getMember_nickname());
			return "../../main/home";
		} else {
			int result2 = dao.naverInsert(bag);
			if (result2 != 0) {
				session.setAttribute("member_no", bag.getMember_no());
				session.setAttribute("member_nickname", bag.getMember_nickname());
				return "../../main/home";
			} else {
				return "redirect:/login.jsp?error=true";
			}
		}
	}
	
	//로그아웃
	@RequestMapping("member/logout")
	public String logout(HttpSession session) {
	    session.invalidate();
	    return "../../member/login";
	}

	
	//email 중복 체크
	@RequestMapping(value = "member/emailCheck", method = RequestMethod.POST)
	@ResponseBody
	public int emailCheck(String member_email) {
		int result = dao.emailCheck(member_email);
		return result;
	}
	
	//id 중복 체크
	@RequestMapping(value = "member/idCheck", method = RequestMethod.POST)
	@ResponseBody
	public int idCheck(String member_id) {
		int result = dao.idCheck(member_id);
		return result;
	}
	
	//nickname 중복 체크
	@RequestMapping(value = "member/nicknameCheck", method = RequestMethod.POST)
	@ResponseBody
	public int nicknameCheck(String member_nickname) {
		int result = dao.nicknameCheck(member_nickname);
		return result;
	}
	
	//id 아이디 찾기
	@RequestMapping(value = "member/idFind", method = RequestMethod.POST)
	@ResponseBody
	public String idFind(MemberVO vo) {
		String member_id = dao.idFind(vo);
		return member_id;
	}
	
	//pw 패스워드 변경하기
	@RequestMapping(value = "member/pwFind", method = RequestMethod.POST)
	@ResponseBody
	public int pwFind(MemberVO vo) {
		int result = dao.pwFind(vo);
		return result;
	}
	
	//mypage로 이동할때
	@RequestMapping("member/mypage")
	public String mypage(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
        int member_no = (Integer) session.getAttribute("member_no");
		MemberVO info = dao.memberInfo(member_no);
		model.addAttribute("info", info); //속성으로 지정
		return "../../member/myPage";
	}
	
	//프로필 이미지, 닉네임, 성별, 연령대 변경
	@RequestMapping(value = "member/profile_up", method = RequestMethod.POST)
	public String profile_up(MemberVO memberVO, HttpServletRequest request, MultipartFile file, Model model) throws Exception {
		
		if(memberVO.getMember_img().equals("myprofile.png")) {
			memberVO.setMember_img("myprofile.png");
		}else {
			if (file != null && !file.isEmpty()) {
				String member_img = file.getOriginalFilename();
				String uploadPath = request.getSession().getServletContext().getRealPath("/resources/upload/profile");
				File directory = new File(uploadPath);
				if (!directory.exists()) {
					directory.mkdirs();
				}
				File target = new File(uploadPath + "/" + member_img);
				file.transferTo(target);
				memberVO.setMember_img(member_img);
			} else {
				// 이미지 파일이 변경되지 않았을 때 기존 이미지 정보를 유지
				MemberVO oldMemberVO = dao.memberInfo(memberVO.getMember_no());
				memberVO.setMember_img(oldMemberVO.getMember_img());
			}
		}

	    System.out.println(memberVO.getMember_img());
	    // 수정된 정보를 다시 조회하여 model에 추가
	    MemberVO updatedMemberVO = dao.profile_up(memberVO);
	    model.addAttribute("memberVO", updatedMemberVO);
	    HttpSession session = request.getSession();
	    session.setAttribute("member_nickname", updatedMemberVO.getMember_nickname());

	    return "forward:/member/mypage";
	}
    
	//이메일, pw, 이름, 전화번호 변경
	@RequestMapping(value = "member/revise_up", method = RequestMethod.POST)
	public String revise_up(MemberVO bag) {
	    if (bag.getMember_pw() == null || bag.getMember_pw().isEmpty()) {
	        // after_pw 값이 비어 있으면 member_pw 정보를 수정하지 않음
	        bag.setMember_pw(null);
	    }
	    dao.revise_up(bag);

	    return "forward:/member/mypage";
	}
	 
	//회원 탈퇴
	 @RequestMapping(value = "member/drop", method = RequestMethod.POST) 
	 public String drop(int member_no, HttpSession session, RedirectAttributes redirectAttributes) {
		System.out.println("회원no입니다" + member_no); 
		dao.drop(member_no); 
		session.invalidate();
		
		 // 알림 메시지를 모델에 추가하여 JSP로 전달
		 redirectAttributes.addFlashAttribute("message", "회원탈퇴 처리가 완료되었습니다.");    
		 return "redirect:/member/login.jsp";
	 }
	 

	/*
	 * @RequestMapping("delete") 
	 * public void delete(String id) {
	 * 		System.out.println(id); 
	 * 		dao.delete(id); 
	 * }
	 * 
	 * @RequestMapping("update") 
	 * public void update(MemberVO bag) {
	 * 		System.out.println(bag); 
	 * 		dao.update(bag); 
	 * }
	 * 
	 * @RequestMapping("one") 
	 * public void one(String id, Model model) {
	 * 		System.out.println(id); 
	 * 		MemberVO vo = dao.one(id); // vo받아서 vo에 넣어둠. 
	 * 		// views까지 전달할 데이터를 model객체를 이용해서 속성으로 지정해주세요. 
	 * 		model.addAttribute("vo", vo); //속성으로 지정 
	 * }
	 * 
	 * @RequestMapping("list") 
	 * public void list(Model model) { 
	 * 		List<MemberVO> list = dao.list(); 
	 * 		model.addAttribute("list", list);
	 * }
	 */

}
