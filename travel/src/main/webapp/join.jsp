<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
<style type="text/css">
.myform {
	background: white;
	width: 50%;
	margin: auto;
	height: auto;
	-webkit-box-shadow: 0px 0px 3px 1px rgba(38, 35, 128, 1);
	-moz-box-shadow: 0px 0px 3px 1px rgba(38, 35, 128, 1);
	box-shadow: 0px 0px 3px 1px rgba(38, 35, 128, 1);azimuth: 
}

.title {
	color: black;
	font-weight: bold;
	font-size: 20pt;
	text-align: center;
	padding-top: 40px
}

#center {
	width: 90%;
	margin: 30px auto;
	text-align: center;
}
table {
	width: 98%;
    margin-left:5%; 
    margin-right:auto;
}
input {
	height: 20px;
	width: 90%;
	margin: 5px auto;
	border-radius: 5px;
	color: black;
	background: white;
	padding-left: 5px;
	font-family: FontAwesome, "Open Sans", Verdana, sans-serif;
	font-style: normal;
	font-size: 8px;
	font-weight: normal;
	text-decoration: inherit;
}

input::placeholder {
	font-style: normal;
	font-size: 8px;
}

td {
	font-size: 10px;
	font-weight: bold;
	text-align: left;
}
.t1{
	width: 55%; 
}

.checkbtn {
	font-size: 3px;
	border-radius: 15px;
	height: 25px;
	background: white;
}

#pwcheck{
	height: 15px;
	margin-left: 5px;
	text-align: left;
	font-size: 3px;
	font-weight: bold;
	color: red;
}

#nextbtn {
	height: 40px;
	width: 82%;
	border-radius: 15px;
	border-color: black;
	margin: 5px auto;
	font-family: sans-serif;
	font-weight: 700;
	font-size: 10pt;
	background: black;
	color: white;
}

::-webkit-input-placeholder {
	/* Chrome/Opera/Safari */
	color: #cccccc;
}

::-moz-placeholder {
	/* Firefox 19+ */
	color: #cccccc;
}

:-ms-input-placeholder {
	/* IE 10+ */
	color: #cccccc;
}

:-moz-placeholder {
	/* Firefox 18- */
	color: #cccccc;
}

@media screen and (max-width:500px) {
	.myform {
		width: 80%;
	}
}

@media screen and (max-width:800px) {
	.myform {
		width: 60%;
	}
}

</style>
</head>
<body>
	<div class="myform">
		<div class="title">회원가입</div>
		<div id="center">
			<form action="insert_0" method="get">
				<table>
					<tr>
						<td>이메일</td>
						<td class="t1"><input name="email" type="email" /></td>
						<td></td>
					</tr>
					<tr>
						<td>아이디</td>
						<td class="t1"><input name="member_id" type="text" placeholder=" 4-10자 사이의 영문,숫자" /></td>
						<td><button class="checkbtn">중복 확인</button></td>
					</tr>
					<tr>
						<td>닉네임</td>
						<td class="t1"><input name="nickname" type="text" /></td>
						<td><button class="checkbtn">중복 확인</button></td>
					</tr>
					<tr>
						<td>패스워드</td>
						<td class="t1"><input name="pw" type="password" placeholder=" 8자 이상" /></td>
						<td></td>
					</tr>
					<tr>
						<td>패스워드 확인</td>
						<td class="t1"><input name="pwCheck" type="password" placeholder=" 8자 이상" /></td>
						<td><button class="checkbtn">확인</button></td>
					</tr>
				</table>
			<div id="pwcheck"></div>
			<button id="nextbtn" type="submit">다음</button>
			</form>
		</div>
	</div>
</body>
</html>