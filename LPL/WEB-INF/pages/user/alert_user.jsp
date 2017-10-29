<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h2>修改数据!!小心谨慎</h2>
<input type="hidden" id="user_code" placeholder="${_ONEUSER_.user_code}" />
<div id="showProduct_from_alter_alert">
	<div id="retrievalCart-styles">
		<div id="retrievalCart_style" class="retrievalCart-styles">
			<span>姓名</span><span>密码</span><span>激活状态</span><span>权限</span><span>详细</span>
		</div>
		<div id="retrievalCart_style">
			<span><input type="text" id="user_name"
				placeholder="${_ONEUSER_.user_name}" /></span> <span><input
				type="text" id="user_password"
				placeholder="${_ONEUSER_.user_password}" /></span> <span><input
				type="text" id="user_state" placeholder="${_ONEUSER_.user_state}" /></span>
			<span><input type="text" id="user_authority"
				placeholder="${_ONEUSER_.user_authority}" /></span> <span><input
				type="text" id="user_password"
				placeholder="${_ONEUSER_.user_password}" /></span> <span><a
				href="#" onclick="deleOnetUser(${_ONEUSER_.user_id});">删除</a><a
				href="#" onclick="admitAlertUser(${_ONEUSER_.user_id});">修改</a></span>
		</div>
	</div>
</div>