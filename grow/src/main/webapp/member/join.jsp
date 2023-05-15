<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
<link rel="stylesheet" type="text/css" href="../resources/css/login_join.css">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#idCheck').click(function() {
			$('#idCheckResult').empty()
			let member_id = $("#member_id").val();
			$.ajax({
				type:'poet', //post형식으로 controller에 보내기
				url:"idCheck.do",
				data:{"member_id": member_id},
				success: function(data) {
					if(data == "N"){ //만약 성공할시
						result = "사용가능한 아이디 입니다.";
						$("#result_idCheck").html(result).css("color", "green");
						$("#member_pw").trigger("focus");
					} else { //만약 실패할시
						result = "이미 사용중인 아이디입니다.";
						$("#result_idCheck").html(result).css("color", "red");
						$("#member_id").val("").trigger("focus");
					} //else
				},
				error: function(error) {alert(error);}
			});//ajax
		});//click
	})//function

</script>
</head>
<body>
	<div class="muluck_logo"><img src="../resources/assets/img/muluck_logo_little.png" alt="로고"></div>
	<div class="myform">
	<div  class="go_login"><a href="login.jsp"><button>X</button></a></div>
		<div class="title">회원가입</div>
		<div class="center">
			<form action="insert" method="get">
				<table id="table1">
					<tr>
						<td><input class="input_join" name="member_email" type="email" placeholder=" 이메일" /></td>
						<td><button class="checkbtn"  type="button">인증</button></td>
					</tr>
					<tr>
						<td><input class="input_join" id="member_id" name="member_id" type="text" placeholder=" 아이디"/></td>
						<!-- placeholder=" 4-10자 사이의 영문,숫자" -->
						<td><button class="checkbtn"  id="idCheck" type="button">중복 확인</button></td>
					</tr>
					<tr>
						<td colspan="2"><div id="result_idCheck" style="font-size: 12px;"></div> </td>
					</tr>
					<tr>
						<td><input class="input_join" name="member_pw" type="password" placeholder=" 패스워드" /></td>
						<!-- placeholder=" 8자 이상" -->
						<td></td>
					</tr>
					<tr>
						<td><input class="input_join" name="pwCheck" type="password" placeholder=" 패스워드 확인" /></td>
						<td><button class="checkbtn" type="button">확인</button></td>
					</tr>
					<tr>
					<td colspan="2"><div class="sameCheck">패스워드가 동일하지 않습니다.</div></td>
					</tr>
					<tr>
						<td><input class="input_join" name="member_name" type="text" placeholder=" 이름" /></td>
						<td></td>
					</tr>
					<tr>
						<td><input class="input_join" type="tel" name='member_tel' placeholder=" 전화번호" minlength="11" maxlength="11"/></td>
						<!-- placeholder=" -없이 숫자만 입력" -->
						<td><button class="checkbtn"  type="button">인증</button></td>
					</tr>
					<tr>
						<td><input class="input_join" name="member_nickname" type="text" placeholder=" 닉네임" /></td>
						<td><button class="checkbtn"  type="button">중복 확인</button></td>
					</tr>
						<tr>
						<td colspan="2">
							<input type="radio" name="member_gender" value="man">남 
							<input type="radio" name="member_gender" value="woman">여  
							<input type="radio" name="member_gender" value="other">기타
						</td>
					</tr>
					<tr>
						<td colspan="2" class="t1">
							<select size="1" name="member_ageRange">
								<option value="">::연령대::</option>
								<option value="10"> 10대</option>							
								<option value="20"> 20대</option>							
								<option value="30"> 30대</option>							
								<option value="40"> 40대</option>							
								<option value="50"> 50대</option>							
								<option value="60"> 60대</option>							
								<option value="기타"> 기타</option>							
							</select>
				        </td>
					</tr>
				</table>
				<div class="text">가. 개인정보의 수집 및 이용 목적
					무우럭(muluck)은 원활한 고객상담, 서비스 제공을 위하여 아래의 최소한의 개인정보를 필수로 수집하고 있습니다. 
					처리하고 있는 개인정보는 다음의 목적 이외의 용도로는 이용되지 않으며, 이용 목적이 변경되는 경우에는 개인정보 보호법 제18조에 따라 별도의 동의를 받는 등 필요한 조치를 이행할 예정입니다.
        
	                나. 정보주체와 법정대리인의 권리ㆍ의무 및 행사방법
	                ① 정보주체(만 14세 미만인 경우에는 법정대리인을 말함)는 언제든지 개인정보 열람·정정·삭제·처리정지 요구 등의 권리를 행사할 수 있습니다.
	                ② 제1항에 따른 권리 행사는 개인정보보호법 시행규칙 별지 제8호 서식에 따라 작성 후 서면, 전자우편 등을 통하여 하실 수 있으며, 기관은 이에 대해 지체 없이 조치하겠습니다.
	                ③ 제1항에 따른 권리 행사는 정보주체의 법정대리인이나 위임을 받은 자 등 대리인을 통하여 하실 수 있습니다. 이 경우 개인정보 보호법 시행규칙 별지 제11호 서식에 따른 위임장을 제출하셔야 합니다.
	                ④ 개인정보 열람 및 처리정지 요구는 개인정보 보호법 제35조 제5항, 제37조 제2항에 의하여 정보주체의 권리가 제한 될 수 있습니다.
	                ⑤ 개인정보의 정정 및 삭제 요구는 다른 법령에서 그 개인정보가 수집 대상으로 명시되어 있는 경우에는 그 삭제를 요구할 수 없습니다.
	                ⑥ 정보주체 권리에 따른 열람의 요구, 정정ㆍ삭제의 요구, 처리정지의 요구 시 열람 등 요구를 한 자가 본인이거나 정당한 대리인인지를 확인합니다.
	                
	                다. 수집하는 개인정보의 항목
	                - 필수항목: 이메일, 아이디, 비밀번호, 이름, 전화번호, 닉네임, 성별, 연령대
	                - 선택항목: 프로필 사진
	                
	                라. 개인정보의 보유 및 이용기간
	                무우럭(muluck)은 법령에 따른 개인정보 보유ㆍ이용기간 또는 정보주체로부터 개인정보를 수집 시에 동의 받은 개인정보 보유ㆍ이용기간 내에서 개인정보를 처리ㆍ보유합니다.
	                
	                - 수집근거: 정보주체의 동의
	                - 보존기간: 회원 탈퇴 요청 전까지(1년 경과 시 재동의)
	                - 보존근거: 정보주체의 동의
	                
	                마. 동의 거부 권리 및 동의 거부에 따른 불이익
	                위 개인정보의 수집 및 이용에 대한 동의를 거부할 수 있으나, 동의를 거부할 경우 회원 가입이 제한됩니다.
				</div>
				<div id="assentCheck">
					<input type="checkbox" name="" id=""> 약관에 동의합니다
				</div>
			<button class="btn black_btn" type="submit">회원가입</button>
			</form>
		</div>
	</div>
</body>
</html>