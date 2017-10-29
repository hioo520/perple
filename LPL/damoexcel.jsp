<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="java.io.*" %>
<%@ page import="damo.util.method.methodType.*" %>
<%@ page import="damo.pojo.*" %>
<% 
    String fname = "大墨鱼网测试";
    OutputStream os = response.getOutputStream();//取得输出流
    response.reset();//清空输出流
PunchClockBean p= new PunchClockBean();
 	
 	p.setBusinessData(request.getParameter("userCode"));
 	p.setClosingTime(request.getParameter("businessData"));
 	p.setDuration(request.getParameter("closingTime"));
 	p.setUserCode(request.getParameter("duration"));
    //下面是对中文文件名的处理
    response.setCharacterEncoding("UTF-8");//设置相应内容的编码格式
    fname = java.net.URLEncoder.encode(fname,"UTF-8");
    response.setHeader("Content-Disposition","attachment;filename="+new String(fname.getBytes("UTF-8"),"GBK")+".xls");
    response.setContentType("application/msexcel");//定义输出类型
    UtilExcel sw = new UtilExcel();
    
    sw.create(os,p);

 %>
<html>
  <head>
    
    <title></title>

  </head>
  
  <body>
  
 <!--    List<Obejct> list;
    PunchClockBean p =new PunchClockBean("93948234","93948234","93948234","93948234");
    list.add(p);
    sw.createList(os,list); -->
  </body>
</html>