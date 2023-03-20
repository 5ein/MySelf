<%@page import="jdbc.MemberDAO3"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    
    MemberDAO3 dao = new MemberDAO3();
    dao.delete(id);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원탈퇴 데이터 전송</title>
<style type="text/css">
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
	<tr><td colspan="2">회원탈퇴 성공</td></tr>
	<tr>
		<td>탈퇴 아이디 : </td>
		<td><%= id %></td>
	</tr>
</table>
</body>
</html>