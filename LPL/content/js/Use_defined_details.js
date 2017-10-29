jquery = document.createElement("script");
jquery.setAttribute("type", "text/javascript");
jquery.setAttribute("src", "content/js/jquery-3.2.1.js"); // 引入外部jq
document.body.appendChild(jquery);






document.getElementById("punchTheClock").onclick = function() { //主动打卡
	$.ajax({
		url : "punchTheClock",
		type : 'get',
		success : function(responseText) {
			$('#body').html(responseText);
		}
	});
}
document.getElementById("leave").onclick = function() { //主动退卡
	$.ajax({
		url : "leave",
		type : 'get',
		success : function(responseText) {
			$('#body').html(responseText);
		}
	});
}
document.getElementById("leave").onclick = function() { //主动退卡
	$.ajax({
		url : "leave",
		type : 'get',
		success : function(responseText) {
			$('#body').html(responseText);
		}
	});
}
document.getElementById("attendance").onclick = function()	{//考勤管理
$.ajax({
	url : "findOnePunchClock",
	type : 'get',
	success : function(responseText) {
		$('#sideber').html(responseText);
	}
});
}
function regedit() { //跳转到注册
	$.ajax({
		url : "regedit_web",
		type : 'get',
		success : function(responseText) {
			$('#sideber').html(responseText);
		}
	});
}


// document.getElementById("getaway").onclick = function() { //主动退出登录
// 	$.ajax({
// 		url : "getaway",
// 		type : 'get',
// 		success : function(responseText) {
// 			$('#sideber').html(responseText);
// 		}
// 	});
// }