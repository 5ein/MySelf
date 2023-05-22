<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>거래 페이지</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
	
	 <!-- Bootstrap CSS -->
  <link href="${pageContext.request.contextPath}/resources/css/styles1.css" rel="stylesheet">
  <!-- jquery  -->
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
	<!-- Navigation-->
	<nav class="navbar navbar-expand-lg navbar-light" id="mainNav2">
		<div class="container px-4 px-lg-5">
			<a class="navbar-brand" href="index.jsp">Muluck</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				Menu <i class="fas fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ms-auto py-4 py-lg-0">
					<li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4"
						href="../main/test">마이페이지</a></li>
					<li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4"
						href="index.jsp">로그아웃</a></li>
				</ul>
			</div>
		</div>
	</nav>
<header>

	<h1 class="site-heading text-center text-faded d-none d-lg-block">
			<!-- <span class="site-heading-lower">무우럭</span>
                <span class="site-heading-upper text-primary mb-3">muluck</span> -->
			<div>
				<img src="${pageContext.request.contextPath}/resources/assets/img/LOGO.png" alt="MULUCK">
			</div>
		</h1>
</header>

	<!-- Navigation-->
	<nav class="navbar navbar-expand-lg navbar-dark py-lg-4" id="mainNav">
		<div class="container">
			
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mx-auto">
					<li class="nav-item px-lg-4"><a
						class="nav-link text-uppercase" href="../main/home.jsp">홈</a></li>
					<ul class="navbar-nav px-lg-4">
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> 커뮤니티 </a>
							<ul class="dropdown-menu dropdown-menu-dark">
								<li><a class="dropdown-item" href="#">자유게시판</a></li>
								<li><a class="dropdown-item" href="#">자랑게시판</a></li>
								<li><a class="dropdown-item" href="#">질문게시판</a></li>
								<li><a class="dropdown-item" href="#">오픈채팅방</a></li>
							</ul>
                        </li>
					</ul>
					<ul class="navbar-nav px-lg-4">
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> 나의 식물 </a>
							<ul class="dropdown-menu dropdown-menu-dark">
								<li><a class="dropdown-item" href="#">식물 일지</a></li>
								<li><a class="dropdown-item" href="#">반려식물 등록증</a></li>
							</ul></li>
					</ul>
					<li class="nav-item px-lg-4"><a
						class="nav-link text-uppercase" href="../plant/plant.jsp">식물
							도감</a></li>
					<ul class="navbar-nav px-lg-4">
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="business_main.jsp" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> 상점 </a>
							<ul class="dropdown-menu dropdown-menu-dark">
								<li><a class="dropdown-item" href="#">나눔</a></li>
								<li><a class="dropdown-item" href="#">거래</a></li>
							</ul>
                        </li>
					</ul>
				</ul>
			</div>
		</div>
	</nav>
	<h1 class="mt-2"> </h1>
	<figure>
	<video src="${pageContext.request.contextPath}/resources/assets/img/pot.mp4" autoplay muted loop></video>
	<div class="inner">
		<h2>MULUCK</h2>
		<p>거래 나눔 페이지</p>
	</div>
	</figure>

	<section>
		<div class="inner">
			<h1>MENU</h1>
			<div class="wrap">
				<article>
					<div class="pic">
						<a href="business_share.jsp"><img src="${pageContext.request.contextPath}/resources/assets/img/hands.jpg" alt="이미지1"></a>
					</div>
					<h2><a href="business_share.jsp">나눔페이지로</a></h2>
					<p>나누고 싶은 마음 함께 나눠요!</p>
				</article>
				
				<article>
					<div class="pic">
						<a href="business_deal.jsp"><img src="${pageContext.request.contextPath}/resources/assets/img/money.jpg" alt="이미지2"></a>
					</div>
					<h2><a href="business_deal.jsp">거래페이지로</a></h2>
					<p>사용안하는 용품 팔아봐요!</p>
				</article>
			</div>
		</div>
	</section>


</body>
</html>