<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="java.io.*" %>
<%@ page import="damo.util.method.methodType.*" %>
<%@ page import="damo.pojo.*" %>
<% 
    String fname = "��ī��������";
    OutputStream os = response.getOutputStream();//ȡ�������
    response.reset();//��������
PunchClockBean p= new PunchClockBean();
 	
 	p.setBusinessData(request.getParameter("userCode"));
 	p.setClosingTime(request.getParameter("businessData"));
 	p.setDuration(request.getParameter("closingTime"));
 	p.setUserCode(request.getParameter("duration"));
    //�����Ƕ������ļ����Ĵ���
    response.setCharacterEncoding("UTF-8");//������Ӧ���ݵı����ʽ
    fname = java.net.URLEncoder.encode(fname,"UTF-8");
    response.setHeader("Content-Disposition","attachment;filename="+new String(fname.getBytes("UTF-8"),"GBK")+".xls");
    response.setContentType("application/msexcel");//�����������
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