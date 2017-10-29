  	function Trim(str){ 
	   return str.replace(/(^\s*)|(\s*$)/g, ""); 
	}

	   function checkUser_name(){
		   //alert("ninlknk!");
		      //取-检测
		      var user=Trim(document.getElementById("user_name").value);
		     // alert(user);
		      if(user!=null){
		    	 //var reg=/^[a-zA-Z]\w{5,7}$/gi;
		   	 	 //var reg=new RegExp("^[a-zA-Z_]{8}$"); //首字母为a-z或A-Z，其后是\w是一个字符，字符允许的个数要为8
		    	 var reg=/^[a-zA-Z]{1}[a-zA-Z0-9]{5,7}$/gi;
		   	 	 if (reg.test(Trim(user))){   	 
		   	 		document.getElementById("user_name_msg").className = 'success_input'; 
		   	 		document.getElementById("user_name_msg").innerHTML="恭喜:用户名验证成功！";
		   	 	 	return true;
		   	 	 }else{
		   	 	    document.getElementById("user_name").value="";
		   	 	    //document.getElementById("user_name_msg").style.color="red";
		   	 	    document.getElementById("user_name_msg").className = 'error_input'; 
		   	 	    document.getElementById("user_name_msg").innerHTML="警告:用户名验证失败a-zA-Z或_,且长度为8！";
		   	 	 	return false;
		   	 	 }
		   	  }else{
		   	  	//alert("警告:请输入用户名!");
		   	  	document.getElementById("user_name").value="";
		   	  	//document.getElementById("user_name_msg").style.color="red";
		   	  	document.getElementById("user_name_msg").className = 'error_input'; 
		   	  	document.getElementById("user_name_msg").innerHTML="警告:请输入用户名！";
		   	 	return false;
		   	 }
		   }
   
   function checkPsw(){
	      //取-检测
	      var password=document.getElementById("password").value;
	      var re_password=document.getElementById("re_password").value;
	      if(re_password!=null&&password!=null){
	   	 	 var reg=new RegExp("^[a-z0-9A-Z_]{6,8}$"); //首字母为a-z或A-Z，其后是\w是一个字符(字母数字_)，字符允许的个数要为6-8
	   	 	 if(Trim(password)==Trim(re_password)){
	   	 		if(!reg.test(password)){
	   	 			document.getElementById("password").value="";
	   	 			document.getElementById("re_password").value="";
	   	 			document.getElementById("password_msg").className = 'error_input'; 
	   	 			document.getElementById("re_password_msg").className = 'error_input'; 
		   	 	    document.getElementById("password_msg").innerHTML="密码不符合规范！为长度6-8位的字母数字组合！";
		   	 	    document.getElementById("re_password_msg").innerHTML="";
	   	   	 	 	return false;
	   	 		}
	   	 		else{
	   	 			document.getElementById("password_msg").className ='success_input'; 
	   	 			document.getElementById("re_password_msg").className ='success_input'; 
	   	 			document.getElementById("password_msg").innerHTML="";
	   	 			document.getElementById("re_password_msg").innerHTML="恭喜：你输入的密码通过！";
	   	 			return true;
	   	 		}
	   	 	 }else{
	 			document.getElementById("password").value="";
	 			document.getElementById("re_password").value="";	 			
	 			document.getElementById("password_msg").className = 'error_input'; 
	 			document.getElementById("re_password_msg").className = 'error_input'; 
	 			document.getElementById("password_msg").innerHTML="";
	   	 	    document.getElementById("re_password_msg").innerHTML="警告：你两次输入的密码不一致！";
	   	 	    document.getElementById("password").focus();
	   	 	 	return false;
	   	 	 }
	   	 	 return true;
	      }
   }
   
   
   function real_nameCheck(){    	
   	var real_name=document.getElementById("real_name").value;
	    if(real_name!=null){
	    //alert(real_name);
	   	   var reg=new RegExp("^[\u4e00-\u9fa5]{2,}$"); //姓名要为2个以上汉字
	   	   if(!reg.test(real_name)){
	   	 		document.getElementById("real_name").value="";
	   	 		document.getElementById("real_name_msg").className = 'error_input'; 
	   	 		document.getElementById("real_name_msg").innerHTML="警告:姓名验证失败，至少2个汉字！";
	   	 		return false;
	   	 	} else{
	   	 		document.getElementById("real_name_msg").className = 'success_input'; 
	   	 		document.getElementById("real_name_msg").innerHTML="恭喜:姓名验证成功！";
	   	 		return true;
	   	   }
	     }else{
	    	 	document.getElementById("real_name").value="";
	   	 		document.getElementById("real_name_msg").className = 'error_input'; 
	   	 		document.getElementById("real_name_msg").innerHTML="警告:请输入用户姓名，至少2个汉字！";
	     }
	    return true;
   }
   
   
   function checkMobile(){
	    var mobile=document.getElementById("mobile").value;
	    if(mobile!=null){
	   	   //var reg=new RegExp("^1[3|5|7|8][0-9]{9}$"); //1开头，3，5，7，8作第2位，第3-11位任意！
	    	var reg=/^1[3|5|7|8][0-9]{9}$/gi;
	   	   if(!reg.test(Trim(mobile))){
	   	 		document.getElementById("mobile").value="";
	   	 		document.getElementById("mobile_msg").className = 'error_input'; 
	   	 		document.getElementById("mobile_msg").innerHTML="警告：你输入的手机号码不符合规范！";
	   	 		return false;
	   	 	}else{
	   	 		document.getElementById("mobile_msg").className = 'success_input'; 
	   	 		document.getElementById("mobile_msg").innerHTML="恭喜:验证成功！";
	   	 		return true;
	   	 	}
	   	   return true;
	     }
   }
   
   
   function checkEmail(){
       var email=document.getElementById("email").value;
	    if(email!=null){
	   	   var reg=new RegExp("^[a-zA-Z0-9_]{1,}@[a-zA-Z0-9]{1,}(\\.com|\\.cn|\\.net){1,}$"); 
	       var regEmail=RegExp("^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$"); //更严格限定
	   	   if(!reg.test(Trim(email))){
		   	 	document.getElementById("email").value="";
	   	 		document.getElementById("email_msg").className = 'error_input'; 
	   	 		document.getElementById("email_msg").innerHTML="警告：你输入的电子邮件不符合规范！";
	   	 		return false;
	   	 	}else{
		   	 	document.getElementById("email_msg").className = 'success_input'; 
	   	 		document.getElementById("email_msg").innerHTML="恭喜:验证成功！";
	   	 		return true;
	   	 	}
	     }
   }