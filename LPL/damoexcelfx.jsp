<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="java.io.File" %>
<%@ page import="jxl.Cell" %>
<%@ page import="jxl.Sheet" %>
<%@ page import="jxl.Workbook" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
    <font size="2">
    <%
        String fileName = "D:/学校竞争力情况.xls";
        File file = new File(fileName);//根据文件名创建一个文件对象
        Workbook wb = Workbook.getWorkbook(file);//从文件流中取得Excel工作区对象
        Sheet sheet = wb.getSheet(0);//从工作区中取得页，取得这个对象的时候既可以用名称来获得，也可以用序号。
        String outPut = "";
        
        outPut = outPut + "<b>" + fileName + "</b><br>";
        outPut = outPut + "第一个sheet的名称为：" + sheet.getName() + "<br>";
        outPut = outPut + "第一个sheet共有：" + sheet.getRows() + "行" + sheet.getColumns() + "列<br>";
        outPut = outPut + "具体内容如下：<br>";
        for(int i=0; i < sheet.getRows(); i++){
            for(int j=0; j < sheet.getColumns(); j++){
                Cell cell = sheet.getCell(j,i);
                outPut = outPut + cell.getContents() + " ";
            }
            outPut = outPut + "<br>";
        }
        out.println(outPut);
     %>
     </font>
  </body>
</html>