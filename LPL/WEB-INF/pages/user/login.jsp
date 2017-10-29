<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="login_back_from">
	<c:if test="${empty _USER_ }">
		<form method="post" action="${pageContext.request.contextPath}/login">
			<div id="login_from">
				<div id="producTretrieva">
					<span><input type="text" id="user_name" name="name"
						placeholder="请输入用户名"><i id="warn"></i></span> <span><input
						type="text" name="password" id="password" placeholder="请输入密码"></span>
				</div>
				<div id="producTretrieval">
					<span><input type="submit" value="提交数据"
						id="login_suubmit123"></span>
				</div>
			</div>
		</form>
	</c:if>
	<c:if test="${not empty _USER_ }">
		<%@ include file="login_ok.jsp"%>
	</c:if>
</div>
