jquery=document.createElement("script");
jquery.setAttribute("type","text/javascript");
jquery.setAttribute("src","content/js/jquery-3.2.1.js");// 引入外部jq
document.body.appendChild(jquery);

function admitAlertUser(id) { //上一页
var username = document.getElementById('user_name').value ==""? document.getElementById('user_name').placeholder:document.getElementById('user_name').value;
var userpassword = document.getElementById('user_password').value ==""? document.getElementById('user_password').placeholder:document.getElementById('user_password').value;
var userstate = document.getElementById('user_state').value ==""? document.getElementById('user_state').placeholder:document.getElementById('user_state').value;
var userauthority = document.getElementById('user_authority').value ==""? document.getElementById('user_authority').placeholder:document.getElementById('user_authority').value;
var usercode = document.getElementById('user_code').value ==""? document.getElementById('user_code').placeholder:document.getElementById('user_code').value;
alert(username);
$.ajax({
	url : "admitAlertUser?user_code="+usercode+"&user_name="+username+"&user_password="+userpassword+"&user_state="+userstate+"&user_authority="+userauthority+"&user_id="+id,
	type : 'post',
	success : function(responseText) {
		$('#sideber').html(responseText);
	}
});
}
