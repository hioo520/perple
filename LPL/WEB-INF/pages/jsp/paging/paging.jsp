<%@page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- 引入头文件标识 -->
<%@ include file="../paging/paging.jsp" %>
<!-- 分页主体文件 -->
<c:forEach items="${__PAGEING_USER_}" var="u">
	<div id="showProduct_from_context">
		<span>${u.user_id}</span><span>${u.user_name}</span><span>${u.user_password}</span><span>${u.user_state}</span><span>${u.user_authority}</span><span
			onclick="reviseUser('${u.user_id}');">明细</span>
	</div>
</c:forEach>
<!-- 分页主体框架 -->
<div id="pagingMain">
	<div id="pagingMove">
		<span class="pagingMap"><input id="pageNumber" type="text"
			placeholder="请输入每页显示多少个"></span><span class="pagingMapKeep"
			id="first_page">首页</span><span class="pagingMapKeep" id="up_page">上一页</span><span
			class="pagingMap" id="all_page"><a href="#">1</a><a href="#">2</a><a
			href="#">3</a></span><span class="pagingMapKeep" id="next_page">下一页</span><span
			class="pagingMapKeep" id="last_page">末页</span><span class="pagingMap"
			id="state_page">当前页码/总页码</span>
	</div>
</div>
<!-- 待上传的整体页面信息 -->
