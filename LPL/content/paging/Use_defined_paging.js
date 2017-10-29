jquery = document.createElement("script");
jquery.setAttribute("type", "text/javascript");
jquery.setAttribute("src", "content/paging/jquery-3.2.1.js"); // 引入外部jq
document.body.appendChild(jquery);







function pageDefault(){ //跳转到分页界面
	$.ajax({
		url : "pageDefault",
		type : 'get',
		success : function(responseText) {
			$('#sideber').html(responseText);
		}
	});
}
//document.getElementById("pageNumber").onchange = function()	{
//$.ajax({
//	url : "pageNumber",
//	type : 'get',
//	success : function(responseText) {
//		$('#sideber').html(responseText);
//	}
//});
//}
//document.getElementById("pageNumber").onchange = 
function pageNumber(){
var firstPage = document.getElementById('firstPage').value ==""? document.getElementById('firstPage').placeholder:document.getElementById('firstPage').value;
var lastPage = document.getElementById('lastPage').value ==""? document.getElementById('lastPage').placeholder:document.getElementById('lastPage').value;
var countPage = document.getElementById('countPage').value ==""? document.getElementById('countPage').placeholder:document.getElementById('countPage').value;
var nowPage = document.getElementById('nowPage').value ==""? document.getElementById('nowPage').placeholder:document.getElementById('nowPage').value;
var allPage = document.getElementById('allPage').value ==""? document.getElementById('allPage').placeholder:document.getElementById('allPage').value;
var defaulPage = document.getElementById('pageNumber').value ==""? document.getElementById('pageNumber').placeholder:document.getElementById('pageNumber').value;
//alert(defaulPage);
$.ajax({
	url : "pageNumber?first_page="+firstPage+"&last_page="+lastPage+"&count_page="+countPage+"&now_page="+nowPage+"&all_page="+allPage+"&defaul_page="+defaulPage,
	type : 'post',
	success : function(responseText) {
		$('#sideber').html(responseText);
	}
});
}

function pageNext(){
var firstPage = document.getElementById('firstPage').value ==""? document.getElementById('firstPage').placeholder:document.getElementById('firstPage').value;
var lastPage = document.getElementById('lastPage').value ==""? document.getElementById('lastPage').placeholder:document.getElementById('lastPage').value;
var countPage = document.getElementById('countPage').value ==""? document.getElementById('countPage').placeholder:document.getElementById('countPage').value;
var nowPage = document.getElementById('nowPage').value ==""? document.getElementById('nowPage').placeholder:document.getElementById('nowPage').value;
var allPage = document.getElementById('allPage').value ==""? document.getElementById('allPage').placeholder:document.getElementById('allPage').value;
var defaulPage = document.getElementById('pageNumber').value ==""? document.getElementById('pageNumber').placeholder:document.getElementById('pageNumber').value;
//alert(defaulPage);
$.ajax({
	url : "pageNext?first_page="+firstPage+"&last_page="+lastPage+"&count_page="+countPage+"&now_page="+nowPage+"&all_page="+allPage+"&defaul_page="+defaulPage,
	type : 'post',
	success : function(responseText) {
		$('#sideber').html(responseText);
	}
});
}

function pageUp(){
var firstPage = document.getElementById('firstPage').value ==""? document.getElementById('firstPage').placeholder:document.getElementById('firstPage').value;
var lastPage = document.getElementById('lastPage').value ==""? document.getElementById('lastPage').placeholder:document.getElementById('lastPage').value;
var countPage = document.getElementById('countPage').value ==""? document.getElementById('countPage').placeholder:document.getElementById('countPage').value;
var nowPage = document.getElementById('nowPage').value ==""? document.getElementById('nowPage').placeholder:document.getElementById('nowPage').value;
var allPage = document.getElementById('allPage').value ==""? document.getElementById('allPage').placeholder:document.getElementById('allPage').value;
var defaulPage = document.getElementById('pageNumber').value ==""? document.getElementById('pageNumber').placeholder:document.getElementById('pageNumber').value;
//alert(defaulPage);
$.ajax({
	url : "pageUp?first_page="+firstPage+"&last_page="+lastPage+"&count_page="+countPage+"&now_page="+nowPage+"&all_page="+allPage+"&defaul_page="+defaulPage,
	type : 'post',
	success : function(responseText) {
		$('#sideber').html(responseText);
	}
});
}
function pageFirst(){
var firstPage = document.getElementById('firstPage').value ==""? document.getElementById('firstPage').placeholder:document.getElementById('firstPage').value;
var lastPage = document.getElementById('lastPage').value ==""? document.getElementById('lastPage').placeholder:document.getElementById('lastPage').value;
var countPage = document.getElementById('countPage').value ==""? document.getElementById('countPage').placeholder:document.getElementById('countPage').value;
var nowPage = document.getElementById('nowPage').value ==""? document.getElementById('nowPage').placeholder:document.getElementById('nowPage').value;
var allPage = document.getElementById('allPage').value ==""? document.getElementById('allPage').placeholder:document.getElementById('allPage').value;
var defaulPage = document.getElementById('pageNumber').value ==""? document.getElementById('pageNumber').placeholder:document.getElementById('pageNumber').value;
//alert(defaulPage);
$.ajax({
	url : "pageFirst?first_page="+firstPage+"&last_page="+lastPage+"&count_page="+countPage+"&now_page="+nowPage+"&all_page="+allPage+"&defaul_page="+defaulPage,
	type : 'post',
	success : function(responseText) {
		$('#sideber').html(responseText);
	}
});
}
function pageLast(){
var firstPage = document.getElementById('firstPage').value ==""? document.getElementById('firstPage').placeholder:document.getElementById('firstPage').value;
var lastPage = document.getElementById('lastPage').value ==""? document.getElementById('lastPage').placeholder:document.getElementById('lastPage').value;
var countPage = document.getElementById('countPage').value ==""? document.getElementById('countPage').placeholder:document.getElementById('countPage').value;
var nowPage = document.getElementById('nowPage').value ==""? document.getElementById('nowPage').placeholder:document.getElementById('nowPage').value;
var allPage = document.getElementById('allPage').value ==""? document.getElementById('allPage').placeholder:document.getElementById('allPage').value;
var defaulPage = document.getElementById('pageNumber').value ==""? document.getElementById('pageNumber').placeholder:document.getElementById('pageNumber').value;
//alert(defaulPage);
$.ajax({
	url : "pageLast?first_page="+firstPage+"&last_page="+lastPage+"&count_page="+countPage+"&now_page="+nowPage+"&all_page="+allPage+"&defaul_page="+defaulPage,
	type : 'post',
	success : function(responseText) {
		$('#sideber').html(responseText);
	}
});
}

