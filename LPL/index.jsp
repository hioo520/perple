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
<script
	src="${pageContext.request.contextPath}/content/js/hover.zoom.js"></script>
<script
	src="${pageContext.request.contextPath}/content/js/hover.zoom.conf.js"></script>
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/content/img/meta.png">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/content/css/Use_defined.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/content/js/util.js"></script>
</head>
<body>
	<div class="navbar navbar-inverse navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" id="index_page" href="#"><c:if
						test="${empty _USER_ }">墨鱼网</c:if> <c:if
						test="${not empty _USER_ }">${sessionScope._USER_.user_name }</c:if></a>
			</div>
			<div class="navbar-collapse collapse"></div>
		</div>
	</div>
	<div id="ww">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 centered">
					<a href="login"><img
						src="${pageContext.request.contextPath}/content/img/user.png"
						alt="邮件测试"></a>
					<c:if test="${empty _USER_}">
						<h1>你好!请先登录</h1>
						<hr>
						<p>
							<a href="login">去登录</a>
						</p>
					</c:if>
					<p>习惯的力量是惊人的，<a href="damoexcel.jsp">damoexcel.jsp</a>习惯决定着你的成功的大小，优秀是一种习惯！</p>
					<p>
						人生的好多次失败，最后并不是败给别人，而是败给了悲观的自己。<a href="#">相信自己，人定胜天。</a>世界上那些最容易的事情中，拖延时间最不费力。
					</p>
				</div>
			</div>
		</div>
	</div>
	<script
		src="${pageContext.request.contextPath}/content/js/bootstrap.min.js"></script>
</body>
</html>