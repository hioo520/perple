<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>大墨鱼</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/content/img/meta.png">
<link
	href="${pageContext.request.contextPath}/content/css/bootstrap.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/content/css/main.css"
	rel="stylesheet">
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/content/img/meta.png">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/content/css/Use_defined.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/content/paging/paging.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/content/js/util.js"></script>
</head>
<body>
	<div class="navbar navbar-inverse navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<%@ include file="jsp/tip.jsp"%>
			</div>
			<div class="navbar-collapse collapse">
				<%@ include file="jsp/navbar.jsp"%>
			</div>
		</div>
	</div>
	<div id="container">
		<div id="content">
			<div class="sideber">
				<div class="row">
					<div class="col-lg-8 col-lg-offset-2 centered">
						<img src="${pageContext.request.contextPath}/content/img/user.png"
							alt="Stanley">
						<c:if test="${empty _USER_}">
							<h1>你好!请先</h1>
							<hr>
							<p>
								<a href="login" id="login">去登录</a>
							</p>
						</c:if>
						<p>习惯的力量是惊人的，习惯决定着你的成功的大小，优秀是一种习惯！</p>
						<p>
							人生的好多次失败，最后并不是败给别人，而是败给了悲观的自己。<a href="#">相信自己，人定胜天。</a>世界上那些最容易的事情中，拖延时间最不费力。
						</p>
					</div>
				</div>
			</div>
		</div>
		<div id="middle"></div>
		<div id="sideber">
			<div id="contentOne"></div>
			<div id="contentTwo"></div>
		</div>
	</div>
	<div class="container pt">
		<div class="row mt">
			<div class="col-lg-6 col-lg-offset-3 centered"></div>
		</div>
		<div class="row mt centered">
			<div class="col-lg-4">
				<a class="zoom green" href="#"><img class="img-responsive"
					src="${pageContext.request.contextPath}/content/img/portfolio/port01.jpg"
					alt="" /></a>
				<p>APE</p>
			</div>
			<div class="col-lg-4">
				<a class="zoom green" href="#"><img class="img-responsive"
					src="${pageContext.request.contextPath}/content/img/portfolio/port02.jpg"
					alt="" /></a>
				<p>RAIDERS</p>
			</div>
			<div class="col-lg-4">
				<a class="zoom green" href="#"><img class="img-responsive"
					src="${pageContext.request.contextPath}/content/img/portfolio/port03.jpg"
					alt="" /></a>
				<p>VIKINGS</p>
			</div>
		</div>
		<div class="row mt centered">
			<div class="col-lg-4">
				<a class="zoom green" href="#"><img class="img-responsive"
					src="${pageContext.request.contextPath}/content/img/portfolio/port04.jpg"
					alt="" /></a>
				<p>YODA</p>
			</div>
			<div class="col-lg-4">
				<a class="zoom green" href="#"><img class="img-responsive"
					src="${pageContext.request.contextPath}/content/img/portfolio/port05.jpg"
					alt="" /></a>
				<p>EMPERORS</p>
			</div>
			<div class="col-lg-4">
				<a class="zoom green" href="#"><img class="img-responsive"
					src="${pageContext.request.contextPath}/content/img/portfolio/port06.jpg"
					alt="" /></a>
				<p>CHIEFS</p>
			</div>
		</div>
	</div>

	</body>
	<script
		src="${pageContext.request.contextPath}/content/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/content/js/Use_defined.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/content/js/Use_defined_details.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/content/paging/Use_defined_paging.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/content/paging/Use_defined_punch.js"></script>
</html>