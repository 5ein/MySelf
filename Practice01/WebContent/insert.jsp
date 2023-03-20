<%@page import="jdbc.MemberDAO3"%>
<%@page import="jdbc.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String name = request.getParameter("name");
    String tel = request.getParameter("tel");
    
    MemberVO bag = new MemberVO();
    bag.setId(id);
    bag.setPw(pw);
    bag.setName(name);
    bag.setTel(tel);
    
    MemberDAO3 dao = new MemberDAO3();
    dao.insert(bag);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 데이터 전송</title>
<style>
body {
	background: #fac4ff;
}
button {
	background: white;
}
td{
	background: white;
	text-align: center;
	width: 120px;
}
</style>
</head>
<body>
<a href="member.html"><button>회원정보 페이지로</button></a>
<hr color="white">
<table border="1">
	<tr><td colspan="2">회원가입 성공</td></tr>
	<tr>
		<td>가입 아이디 : </td>
		<td><%= id %></td>
	</tr>
	<tr>
		<td>가입 패스워드 : </td>
		<td><%= pw %></td>
	</tr>
	<tr>
		<td>가입 회원이름 : </td>
		<td><%= name %></td>
	</tr>
	<tr>
		<td>가입 전화번호 : </td>
		<td><%= tel %></td>
	</tr>
</table>
</body>
</html>