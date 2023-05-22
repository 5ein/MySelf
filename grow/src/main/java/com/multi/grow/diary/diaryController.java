package com.multi.grow.diary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록
public class diaryController {

	@Autowired 
	//MemberDAO의 싱글톤 객체가 ram의 어디에 있는지 찾아서 그 주소를 아래 변수에 넣어
	diaryDAO dao; //전역변수(글로벌 변수)
	//컨트롤 하는 기능(CRUD)
	//회원가입, 수정, 탈퇴, 정보검색
	
	//클래스 내에서 기능처리 담당
	//멤버변수 + 멤버메서드(기능처리 담당)
	
	//하나의 요청당 하나의 메서드
	//하나의 버튼 호출당 하나의 함수 연결!
	//요청된 주소가 어떻게 될 때
	//바로 아래에 있는 메서드가 호출이 될지를 써주어야 한다.
	
	//@RequestMapping("login")
	//public String login(MemberVO bag, HttpSession session) {
		//메서드의 입력변수(파라메터)로 변수를 선언해두면, 컨트롤러 내의 메서드 내에서는 
		//bag을 만들어서 클라이언트로부터 전달된 데이터도 다 넣어줌.
		//1)bag 만들어서 2)클라이언트로부터 전달된 데이터도 받아줌. 3)bag에 데이터 다 넣어줌.
		//System.out.println("login 요청됨.");
		//System.out.println(bag);
		//dao를 이용해서 db처리할 예정.
		//views 아래로 넘어가게 되어있음. login.jsp를 호출하게 됨.
		//System.out.println(dao);
		//int result = dao.login(bag);
		//DAO에게 login 요청
		//if (result == 1) {
			//로그인이 성공하면, 세션을 잡아두자!!
			//session.setAttribute("id", bag.getId());
			//return "ok"; //views 아래 파일
		//}else {
			//views 아래가 아니고, webapp 아래 member.jsp로 가고싶은 경우
			//return "redirect:member.jsp";
		//}
	//}
	/*
	 * @RequestMapping(path = "/main") public String main(Model model) { return
	 * "index"; }
	 */
	
	@RequestMapping("diary/cardview")
	public void insert(diaryVO bag) {
		System.out.println("cardview 요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.cardview(bag);
		//DAO에게 insert 요청
	}
	
	/*
	 * @RequestMapping("update") public void update(kidsVO bag) {
	 * System.out.println("update 요청됨."); System.out.println(bag); dao.update(bag);
	 * }
	 * 
	 * @RequestMapping("delete") public void delete(String id) {
	 * System.out.println("delete 요청됨."); System.out.println(id); dao.delete(id); }
	 * 
	 * @RequestMapping("one") public void one(String id, Model model) {
	 * System.out.println(id); kidsVO bag = dao.one(id); model.addAttribute("bag",
	 * bag); }
	 */ 
	 @RequestMapping("diary/cardview_list") 
	 public void list(Model model) { //Model은 컨트롤러의 list를 views/list.jsp까지만 전달할 수 있는 객체 
	 List<diaryVO> list = dao.list();
	 model.addAttribute("list", list); 
	 
	 }
	 
	 
}
