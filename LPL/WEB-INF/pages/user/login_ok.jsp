<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="loginOk">
	<span>恭喜您!登录成功>><i>在线人数是 :${onLineUser}</i></span> <span>2017年9月6日星期三</span>
	<span>用户姓名:<i>${sessionScope._USER_.user_name}</i><i><a
			href="#" id="getaway"><strong> 安全退出</strong></a></i></span>
</div>
