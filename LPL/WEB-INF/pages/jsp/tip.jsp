<%@ page language="java" import="java.util.*" pageEncoding="Utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<a class="navbar-brand" href="index"><c:if test="${empty _USER_ }">大墨鱼</c:if>
	<c:if test="${not empty _USER_ }"><i>${sessionScope._USER_.user_name }</i> @你好</c:if></a>