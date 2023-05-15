package com.multi.grow.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
				
	@Autowired 
	MemberDAO dao;

	@RequestMapping("insert")
	public String insert(MemberVO bag) {
		System.out.println(bag);
		dao.insert(bag);
		return "member/insert";
	}
	
	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println(id);
		dao.delete(id);
	}
	
	@RequestMapping("update")
	public void update(MemberVO bag) {
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println(id);
		MemberVO vo = dao.one(id); //vo받아서 vo에 넣어둠.
		//views까지 전달할 데이터를 model객체를 이용해서 속성으로 지정해주세요.
		model.addAttribute("vo", vo); //속성으로 지정
	}
	
	@RequestMapping("list")
	public void list(Model model) {
		List<MemberVO> list = dao.list(); 
		model.addAttribute("list", list);
	}
	
	@RequestMapping("member/idCheck.do")
    //@ResponseBody ajax 값을 바로jsp 로 보내기위해 사용
    public String idCheck(@RequestParam("member_id") String id) {
        String result="N";
        
        int flag = AjaxService.idCheck(id);
        
        if(flag == 1) result ="Y"; 
        //아이디가 있을시 Y 없을시 N 으로jsp view 로 보냄
        return result;
    }
	
}

