jquery=document.createElement("script");
jquery.setAttribute("type","text/javascript");
jquery.setAttribute("src","content/js/jquery-3.2.1.js");// 引入外部jq
document.body.appendChild(jquery);

document.getElementById("index_page").onclick = function()	{
$.ajax({
	url : "index",
	type : 'get',
	success : function(responseText) {
		$('body').html(responseText);
	}
});
}
