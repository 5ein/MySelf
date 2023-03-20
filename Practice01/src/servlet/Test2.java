package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/test2.do")
public class Test2 extends HttpServlet {
	String mood = "";
	
	public void init(ServletConfig config) throws ServletException {
		mood = config.getInitParameter("mood");
		System.out.println(mood);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("오늘의 기분: " + mood);
		out.close();
	}

}
