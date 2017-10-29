<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="../jsp/show_user_part.jsp"%>
<c:forEach items="${_ALLUSER_}" var="u">
	<div id="showProduct_from_context">
		<span>${u.user_id}</span><span>${u.user_name}</span><span>${u.user_password}</span><span>${u.user_state}</span><span>${u.user_authority}</span><span
			onclick="reviseUser('${u.user_id}');">明细</span>
	</div>
</c:forEach>
<center><a href= "#" onclick ="pageDefault();" ><h1>查看更多员工信息</h1></a></center>