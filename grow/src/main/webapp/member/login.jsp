<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
<link rel="stylesheet" type="text/css" href="../resources/css/login_join.css">
</head>
<body>
	<div class="muluck_logo"><img src="../resources/assets/img/muluck_logo_little.png" alt="로고"></div>
	<div class="myform">
		<div id="login" class="title">로그인</div>
		<div class="center">
			<form>
				<input class="input_login" placeholder="  아이디" /> 
				<input class="input_login" type="password" placeholder="  패스워드" />
				<div class="text1">
					<input class="input_login" type="checkbox" name="" id=""> 아이디 저장
				</div>
				<button class="btn black_btn" type="submit">로그인</button>
			</form>
			<a href="join.jsp"><button class="btn white_btn">회원가입</button></a>
			<div class="text1">
				<a href="#">아이디 찾기 / 비밀번호 찾기</a>
			</div>
			<hr style="color: gray; margin-left: 5%; margin-right: 5%;">
			<div id="text2">
				<b>SNS 계정으로 로그인하기</b>
			</div>
			<div id="logo">
				<button class='btn-social-login' style='background: #1FC700'><i class="xi-2x xi-naver"></i></button>
				<button class='btn-social-login' style='background: #FFEB00'><i class="xi-2x xi-kakaotalk text-dark"></i></button>
				<button class='btn-social-login' style='background: #4267B2'><i class="xi-2x xi-facebook"></i></button>
				<button class='btn-social-login' style='background: #D93025'><i class="xi-2x xi-google"></i></button>
			</div>
		</div>
	</div>
</body>
</html>