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
    margin-left:10%; 
    margin-right:auto;
}
input[type="date"] {
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

#numcheck{
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

.text {
	width:90%;
    height: 90px; border: 1px solid black; background-color: white;
    white-space: pre-line; overflow-y: scroll; margin: 0 auto 10px;
    font-size: 10px;
}
#check {
	font-size: 10px;
	margin-right: 10%;
	text-align: right;
}
input[type="checkbox"] {
	width: 15px;
	height: 15px;
	vertical-align: -3px;
}

input[type="radio"]{
	vertical-align: -3px;
}

select{
 font-size: 5px;
}

</style>
</head>
<body>
	<div class="myform">
		<div class="title">회원가입</div>
		<div id="center">
			<form action="insert" method="get">
			<input name="email" value="${param.email}" type="hidden"/>
			<input name="member_id" value="${param.member_id}" type="hidden"/>
			<input name="nickname" value="${param.nickname}" type="hidden"/>
			<input name="pw" value="${param.pw}" type="hidden"/>
				<table>
					<tr>
						<td>생년월일</td>
						<td class="t1"><input name="birthdate" type="date" name="birthdate"></td>
						<td></td>
					</tr>
					<tr>
						<td>성별</td>
						<td colspan="2">
							<input type="radio" name="gender" value="man">남 
							<input type="radio" name="gender" value="woman">여  
							<input type="radio" name="gender" value="other">기타
						</td>
					</tr>
					<tr>
						<td>전화번호</td>
						<td class="t1">
							<select size="1">
								<option value="">::통신사::</option>
								<option value="skt">SKT</option>							
								<option value="kt">KT</option>							
								<option value="LG U+">LG U+</option>							
								<option value="알뜰폰">알뜰폰</option>							
							</select>
							<input type="tel" name='tel' placeholder=" -없이 숫자만 입력" minlength="11" maxlength="11"/>
				        </td>
						<td><button class="checkbtn">인증번호 받기</button></td>
					</tr>
					<tr>
						<td>인증번호</td>
						<td class="t1"><input type="password"/></td>
						<td><button class="checkbtn">인증번호 확인</button></td>
					</tr>
				</table>
			<div id="numcheck"></div>
				<div class="text">가. 개인정보의 수집 및 이용 목적
					트래블러버는 성별, 나이 등의 개인정보에 대한 AI추천 서비스 제공의 목적을 위하여 개인정보를 처리합니다. 처리하고 있는 개인정보는 다음의 목적 이외의 용도로는 이용되지 않으며, 이용 목적이 변경되는 경우에는 개인정보 보호법 제18조에 따라 별도의 동의를 받는 등 필요한 조치를 이행할 예정입니다.
        
	                나. 정보주체와 법정대리인의 권리ㆍ의무 및 행사방법
	                ① 정보주체(만 14세 미만인 경우에는 법정대리인을 말함)는 언제든지 개인정보 열람·정정·삭제·처리정지 요구 등의 권리를 행사할 수 있습니다.
	                ② 제1항에 따른 권리 행사는 개인정보보호법 시행규칙 별지 제8호 서식에 따라 작성 후 서면, 전자우편 등을 통하여 하실 수 있으며, 기관은 이에 대해 지체 없이 조치하겠습니다.
	                ③ 제1항에 따른 권리 행사는 정보주체의 법정대리인이나 위임을 받은 자 등 대리인을 통하여 하실 수 있습니다. 이 경우 개인정보 보호법 시행규칙 별지 제11호 서식에 따른 위임장을 제출하셔야 합니다.
	                ④ 개인정보 열람 및 처리정지 요구는 개인정보 보호법 제35조 제5항, 제37조 제2항에 의하여 정보주체의 권리가 제한 될 수 있습니다.
	                ⑤ 개인정보의 정정 및 삭제 요구는 다른 법령에서 그 개인정보가 수집 대상으로 명시되어 있는 경우에는 그 삭제를 요구할 수 없습니다.
	                ⑥ 정보주체 권리에 따른 열람의 요구, 정정ㆍ삭제의 요구, 처리정지의 요구 시 열람 등 요구를 한 자가 본인이거나 정당한 대리인인지를 확인합니다.
	                
	                다. 수집하는 개인정보의 항목
	                트래블러버 회원정보(필수): 이름, 이메일(아이디), 비밀번호, 성별, 나이, 전화번호
	                
	                라. 개인정보의 보유 및 이용기간
	                트래블러버는 법령에 따른 개인정보 보유ㆍ이용기간 또는 정보주체로부터 개인정보를 수집 시에 동의 받은 개인정보 보유ㆍ이용기간 내에서 개인정보를 처리ㆍ보유합니다.
	                
	                - 수집근거: 정보주체의 동의
	                - 보존기간: 회원 탈퇴 요청 전까지(1년 경과 시 재동의)
	                - 보존근거: 정보주체의 동의
	                
	                마. 동의 거부 권리 및 동의 거부에 따른 불이익
	                위 개인정보의 수집 및 이용에 대한 동의를 거부할 수 있으나, 동의를 거부할 경우 회원 가입이 제한됩니다.
				</div>
				<div id="check">
					<input type="checkbox" name="" id=""> 약관에 동의합니다
				</div>
			<button id="nextbtn" type="submit">회원가입</button>
			</form> 		
		</div>
	</div>
</body>
</html>