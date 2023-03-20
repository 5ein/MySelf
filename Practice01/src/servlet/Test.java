package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test.do")
public class Test extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.setContentType("text/html;charset=utf-8");
		
		String today = request.getParameter("today");
		String result = "";
		if (today.equals("좋음")) {
			result = "오늘 하루도 알차게 보내자!";
		}else if (today.equals("나쁨")) {
			result = "안좋은 일은 털어버리고 힘내자!";
		}else if (today.equals("신남")) {
			result = "신나는 텐션을 가지고 오늘도 화이팅!";
		}else if (today.equals("화남")) {
			result = "화를 식히기위해 쉬어보자!";
		}else if (today.equals("슬픔")) {
			result = "슬프지만 이겨낼수있어!";
		}else if (today.equals("평범")) {
			result = "평범한게 최고지~ 오늘도 파이팅!";
		}
		
		PrintWriter out = response.getWriter();
		out.print("오늘의 한줄: " + result);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String pw = request.getParameter("pw");
		String result = "";
		if (pw.equals("open")) {
			result = "문이 열립니다. <img src='yes.png' width=600 height=200>";
		}else {
			result = "암호가 틀렸습니다. <img src='no.png' width=600 height=200>";
		}
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out =response.getWriter();
		out.print(result);
		out.close();
	}

}
