function getXHR() {
	var xmlHttp;
	try {		
		xmlHttp = new XMLHttpRequest();// Firefox, Opera 8.0+, Safari
	} catch (e) {		
		try {// Internet Explorer
			xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (e) {
			try {
				xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (e) {
				alert("您的浏览器不支持AJAX！");
				return false;
			}
		}
	}
	return xmlHttp;
}

