<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/login_join.css">
</head>
<body>
	<div class="muluck_logo"><img src="resources/assets/img/muluck_logo_little.png" alt="로고"></div>
	<div class="myform">
		<div><a><button>X</button></a></div>
		<div class="title">회원가입</div>
		<div class="center">
			<form action="insert_0" method="get">
				<table id="table1">
					<tr>
						<td>이메일</td>
						<td class="t1"><input class="input_join" name="email" type="email" /></td>
						<td></td>
					</tr>
					<tr>
						<td>아이디</td>
						<td class="t1"><input class="input_join" name="member_id" type="text" placeholder=" 4-10자 사이의 영문,숫자" /></td>
						<td><button class="checkbtn"  type="button">중복 확인</button></td>
					</tr>
					<tr>
						<td>닉네임</td>
						<td class="t1"><input class="input_join" name="nickname" type="text" /></td>
						<td><button class="checkbtn"  type="button">중복 확인</button></td>
					</tr>
					<tr>
						<td>패스워드</td>
						<td class="t1"><input class="input_join" name="pw" type="password" placeholder=" 8자 이상" /></td>
						<td></td>
					</tr>
					<tr>
						<td>패스워드 확인</td>
						<td class="t1"><input class="input_join" name="pwCheck" type="password" placeholder=" 8자 이상" /></td>
						<td><button class="checkbtn" type="button">확인</button></td>
					</tr>
				</table>
			<div class="sameCheck"></div>
			<button class="btn black_btn" type="submit">다음</button>
			</form>
		</div>
	</div>
</body>
</html>