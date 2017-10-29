<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="panch_from_header">
	<div id="displayOrderDetailed"></div>
	<span>姓名</span><span>打卡时间</span><span>下班打卡</span><span>工作时长</span><span>发送邮箱</span><span>分享</span>
</div>
</div>
<div id="showProduct_from_context">
	<c:forEach items="${_PUNCHCLOCK_ }" var="u">
		<span>XXOO</span>
		<span>${u.businessData}</span><span>${u.closingTime}</span><span>${u.duration}</span><span onclick="sendEmal('${u.userCode}');">发送邮箱</span><span onclick="revisePunch('${p.userCode}');">备注</span>
	</c:forEach>
</div>
<center>
	<a href="#" onclick="punchDefault();"><h1>查看更多员工信息</h1></a>
</center>
<!-- // [PunchClockBean [userCode=15f83296a55bb6f9bb77329a5c6ad8b7, businessData=2017-10-27 03:38:55,closingTime=2017-10-27,10:46:03.0, duration=7.00]] -->