<%@page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 引入头文件标识 -->
<div id="panch_from_header">
	<div id="displayOrderDetailed"></div>
	<span>姓名</span><span>打卡时间</span><span>下班打卡</span><span>工作时长</span><span>发送邮箱</span><span>分享</span>
</div>
	<!-- 分页主体文件 -->
	<c:forEach items="${__PAGEING_USER_}" var="u">
<div id="showProduct_from_context">
	<span>XXOO</span><span>${u.businessData}</span><span>${u.closingTime}</span><span>${u.duration}</span><span onclick="sendEmal('${u.userCode}');">发送邮箱</span><span
		onclick="dowenExcel('${u.userCode}','${u.businessData}','${u.closingTime}','${u.duration}');"><a href="damoexcel.jsp">E</a>xcel</span>
</div>
</c:forEach>
<!-- 分页主体框架 -->
<div id="pagingMain">
	<div id="pagingMove">
		<span class="pagingMap">当前每页:<input id="pageNumber"  onchange="punchNumber();" type="text"
			placeholder="${__PAGEING_.defaul_page}">个</span><span class="pagingMapKeep"
			id="first_page" onclick="punchFirst();">首页</span><span class="pagingMapKeep" id="up_page" onclick="punchUp();">上一页</span><span
			class="pagingMap" id="all_page"><a href="#">1</a><a href="#">2</a><a
			href="#">3</a></span><span class="pagingMapKeep" id="pageNext" onclick="punchNext();">下一页</span><span
			class="pagingMapKeep" id="last_page"onclick="punchLast();">末页</span><span class="pagingMap"
			id="state_page">当前第:${__PAGEING_.now_page}页/总:${__PAGEING_.count_page}条</span>
	</div>
</div>
<!-- 待上传的整体页面信息 -->
<div style="display:hidden">
	<span id="pagingHidden"><input type="hidden" placeholder="${__PAGEING_.first_page}" id="firstPage"><!-- 开始页头下标:${__PAGEING_.first_page} --></span>
	<span id="pagingHidden"><input type="hidden" placeholder="${__PAGEING_.last_page}" id="lastPage"><!-- 结束页头下标:${__PAGEING_.last_page} --></span>
	<span id="pagingHidden"><input type="hidden" placeholder="${__PAGEING_.count_page}" id="countPage"><!-- 总计记录:${__PAGEING_.count_page} --></span>
	<span id="pagingHidden"><input type="hidden" placeholder="${__PAGEING_.now_page}" id="nowPage"><!-- 当前页码:${__PAGEING_.now_page} --></span>
	<!-- <span id="pagingHidden"><input type="hidden" placeholder="${__PAGEING_.defaul_page}" id="defaulPage">${__PAGEING_.defaul_page} --></span>
	<span id="pagingHidden"><input type="hidden" placeholder="${__PAGEING_.all_page}" id="allPage"><!-- 傻瓜跳转: --></span>
</div>
