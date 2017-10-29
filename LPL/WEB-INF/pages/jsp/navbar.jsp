<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${not empty _USER_}">
	<div id="nav_frame" class="nav navbar-nav navbar-right">
		<span id="index_page">首页</span>
		<c:if test="${not empty _LOGIN_OK_ }">
			<span>已登录</span>
		</c:if>
		<c:if test="${empty _LOGIN_OK_}">
			<span id="login">登录</span>
		</c:if>
		<c:if test="${not empty _regedit_ }">
			<span id="#">注册成功</span>
		</c:if>
		<c:if test="${empty _LOGIN_OK_ }">
			<c:if test="${empty _regedit_ }">
				<span id="regedit" onclick="regedit();">注册吧</span>
			</c:if>
		</c:if>
		<c:if test="${not empty _ROOT_}">
			<span id="attendance">考勤区</span>
			<span onclick="userManagement();">用户管理</span>
		</c:if>
		<c:if test="${not empty _PUNCH_OK_}">
			<span>已经打卡</span>
		</c:if>
		<c:if test="${empty _PUNCH_OK_}">
			<span id="punchTheClock">打卡</span>
		</c:if>
		<c:if test="${not empty _PUNCH_LEAVE_}">
			<span>可以走了${_PUNCH_LEAVE_}</span>
		</c:if>
		<c:if test="${empty _PUNCH_LEAVE_}">
			<span id="leave">走人${_PUNCH_LEAVE_}</span>
		</c:if>
	</div>
</c:if>
