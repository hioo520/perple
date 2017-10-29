jquery = document.createElement("script");
jquery.setAttribute("type", "text/javascript");
jquery.setAttribute("src", "content/paging/jquery-3.2.1.js"); // 引入外部jq
document.body.appendChild(jquery);






function dowenExcels() { //下载Excel
	$.ajax({
		url : "excelDefault",
		type : 'get',
		success : function(responseText) {
			$('#sideber').html(responseText);
		}
	});
}
function sendEmal(id) { //发邮件
	alert(id);
	$.ajax({
		url : "sendEmal?id="+id,
		type : 'get',
		success : function(responseText) {
			$('#sideber').html(responseText);
		}
	});
}
function punchDefault() { //跳转到分页界面
	$.ajax({
		url : "punchDefault",
		type : 'get',
		success : function(responseText) {
			$('#sideber').html(responseText);
		}
	});
}
//document.getElementById("pageNumber").onchange = 
function punchNumber() {
	var firstPage = document.getElementById('firstPage').value == "" ? document.getElementById('firstPage').placeholder : document.getElementById('firstPage').value;
	var lastPage = document.getElementById('lastPage').value == "" ? document.getElementById('lastPage').placeholder : document.getElementById('lastPage').value;
	var countPage = document.getElementById('countPage').value == "" ? document.getElementById('countPage').placeholder : document.getElementById('countPage').value;
	var nowPage = document.getElementById('nowPage').value == "" ? document.getElementById('nowPage').placeholder : document.getElementById('nowPage').value;
	var allPage = document.getElementById('allPage').value == "" ? document.getElementById('allPage').placeholder : document.getElementById('allPage').value;
	var defaulPage = document.getElementById('pageNumber').value == "" ? document.getElementById('pageNumber').placeholder : document.getElementById('pageNumber').value;
	//alert(defaulPage);
	$.ajax({
		url : "punchNumber?first_page=" + firstPage + "&last_page=" + lastPage + "&count_page=" + countPage + "&now_page=" + nowPage + "&all_page=" + allPage + "&defaul_page=" + defaulPage,
		type : 'post',
		success : function(responseText) {
			$('#sideber').html(responseText);
		}
	});
}

function punchNext() {
	var firstPage = document.getElementById('firstPage').value == "" ? document.getElementById('firstPage').placeholder : document.getElementById('firstPage').value;
	var lastPage = document.getElementById('lastPage').value == "" ? document.getElementById('lastPage').placeholder : document.getElementById('lastPage').value;
	var countPage = document.getElementById('countPage').value == "" ? document.getElementById('countPage').placeholder : document.getElementById('countPage').value;
	var nowPage = document.getElementById('nowPage').value == "" ? document.getElementById('nowPage').placeholder : document.getElementById('nowPage').value;
	var allPage = document.getElementById('allPage').value == "" ? document.getElementById('allPage').placeholder : document.getElementById('allPage').value;
	var defaulPage = document.getElementById('pageNumber').value == "" ? document.getElementById('pageNumber').placeholder : document.getElementById('pageNumber').value;
	//alert(defaulPage);
	$.ajax({
		url : "punchNext?first_page=" + firstPage + "&last_page=" + lastPage + "&count_page=" + countPage + "&now_page=" + nowPage + "&all_page=" + allPage + "&defaul_page=" + defaulPage,
		type : 'post',
		success : function(responseText) {
			$('#sideber').html(responseText);
		}
	});
}

function punchUp() {
	var firstPage = document.getElementById('firstPage').value == "" ? document.getElementById('firstPage').placeholder : document.getElementById('firstPage').value;
	var lastPage = document.getElementById('lastPage').value == "" ? document.getElementById('lastPage').placeholder : document.getElementById('lastPage').value;
	var countPage = document.getElementById('countPage').value == "" ? document.getElementById('countPage').placeholder : document.getElementById('countPage').value;
	var nowPage = document.getElementById('nowPage').value == "" ? document.getElementById('nowPage').placeholder : document.getElementById('nowPage').value;
	var allPage = document.getElementById('allPage').value == "" ? document.getElementById('allPage').placeholder : document.getElementById('allPage').value;
	var defaulPage = document.getElementById('pageNumber').value == "" ? document.getElementById('pageNumber').placeholder : document.getElementById('pageNumber').value;
	//alert(defaulPage);
	$.ajax({
		url : "punchUp?first_page=" + firstPage + "&last_page=" + lastPage + "&count_page=" + countPage + "&now_page=" + nowPage + "&all_page=" + allPage + "&defaul_page=" + defaulPage,
		type : 'post',
		success : function(responseText) {
			$('#sideber').html(responseText);
		}
	});
}
function punchFirst() {
	var firstPage = document.getElementById('firstPage').value == "" ? document.getElementById('firstPage').placeholder : document.getElementById('firstPage').value;
	var lastPage = document.getElementById('lastPage').value == "" ? document.getElementById('lastPage').placeholder : document.getElementById('lastPage').value;
	var countPage = document.getElementById('countPage').value == "" ? document.getElementById('countPage').placeholder : document.getElementById('countPage').value;
	var nowPage = document.getElementById('nowPage').value == "" ? document.getElementById('nowPage').placeholder : document.getElementById('nowPage').value;
	var allPage = document.getElementById('allPage').value == "" ? document.getElementById('allPage').placeholder : document.getElementById('allPage').value;
	var defaulPage = document.getElementById('pageNumber').value == "" ? document.getElementById('pageNumber').placeholder : document.getElementById('pageNumber').value;
	//alert(defaulPage);
	$.ajax({
		url : "punchFirst?first_page=" + firstPage + "&last_page=" + lastPage + "&count_page=" + countPage + "&now_page=" + nowPage + "&all_page=" + allPage + "&defaul_page=" + defaulPage,
		type : 'post',
		success : function(responseText) {
			$('#sideber').html(responseText);
		}
	});
}
function punchLast() {
	var firstPage = document.getElementById('firstPage').value == "" ? document.getElementById('firstPage').placeholder : document.getElementById('firstPage').value;
	var lastPage = document.getElementById('lastPage').value == "" ? document.getElementById('lastPage').placeholder : document.getElementById('lastPage').value;
	var countPage = document.getElementById('countPage').value == "" ? document.getElementById('countPage').placeholder : document.getElementById('countPage').value;
	var nowPage = document.getElementById('nowPage').value == "" ? document.getElementById('nowPage').placeholder : document.getElementById('nowPage').value;
	var allPage = document.getElementById('allPage').value == "" ? document.getElementById('allPage').placeholder : document.getElementById('allPage').value;
	var defaulPage = document.getElementById('pageNumber').value == "" ? document.getElementById('pageNumber').placeholder : document.getElementById('pageNumber').value;
	//alert(defaulPage);
	$.ajax({
		url : "punchLast?first_page=" + firstPage + "&last_page=" + lastPage + "&count_page=" + countPage + "&now_page=" + nowPage + "&all_page=" + allPage + "&defaul_page=" + defaulPage,
		type : 'post',
		success : function(responseText) {
			$('#sideber').html(responseText);
		}
	});
}

function dowenExcel(userCode, businessData, closingTime, duration) {
	$.ajax({
		url : "dowenExcel?userCode=" + userCode + "&businessData=" + businessData + "&closingTime=" + closingTime + "&duration=" + duration,
		type : 'post',
		success : function(responseText) {
//			$('#sideber').html(responseText);
		}
	});
}
//dowenExcel('${u.userCode}','${u.businessData}','${u.closingTime}','${u.duration}')