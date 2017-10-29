<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/content/js/check_reg.js"></script>
<div id="regedit_form">
	<form id="regedit" name="regForm" action="register_userDetailde"
		method="post">
		<div>
			<span>用户</span> <span><input type="text" name="user_name"
				id="user_name" onblur="checkUser_name();" maxlength="8" /></span> <span><font
				id="user_name_msg" class="success_input">长度8,包含字母数字组合，且以字母开头...</font></span>
		</div>
		<div>
			<span>密码</span> <span><input type="password" id="password" /></span>
			<span><font id="password_msg" class="success_input">密码6-8以内包含字母数字组合...</font></span>
		</div>
		<div>
			<span>确认</span> <span><input type="password" id="re_password"
				name="password" onblur="checkPsw();" /></span> <span><font
				id="re_password_msg" class="success_input">密码确认...</font></span>
		</div>
		<div>
			<span>真名</span> <span><input type="text" name="real_name"
				id="real_name" onblur="real_nameCheck();" /></span> <span><font
				id="real_name_msg" class="success_input">请输入汉字姓名！</font></span>
		</div>
		<div>
			<span>电话</span> <span><input type="text" name="mobile"
				id="mobile" maxlength="11" onblur="checkMobile();" /></span> <span><font
				id="mobile_msg" class="success_input">输入11位手机号码...</font></span>
		</div>
		<div>
			<span>电子邮件</span> <span><input type="text" name="email"
				id="email" onblur="checkEmail();" /></span> <span><font
				id="email_msg" class="success_input">请输入电子邮件...</font></span>
		</div>
		<div>
			<span>密码提示</span> <span><input type="text"
				name="password_question" /></span> <span><font
				id="password_question_msg" class="success_input">输入找回密码的问题...</font></span>
		</div>
		<div>
			<span>密码找回</span> <span><input type="text"
				name="password_hint_answer" /></span> <span><font
				id="password_hint_answer_msg" class="success_input">输入找回密码的问题对应的答案...</font></span>
		</div>
		<div>
			<span>权限 </span> <span> <select name="auth">
					<option value="0">普通用户</option>
					<option value="1">管理员</option>
			</select>
			</span> <span><font id="auth_msg" class="success_input">选择注册权限...</font></span>
		</div>
		<div>
			<center>
				<input type="submit" value="注册" />
			</center>
		</div>
	</form>
</div>

