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
        String fileName = "D:/ѧУ���������.xls";
        File file = new File(fileName);//�����ļ�������һ���ļ�����
        Workbook wb = Workbook.getWorkbook(file);//���ļ�����ȡ��Excel����������
        Sheet sheet = wb.getSheet(0);//�ӹ�������ȡ��ҳ��ȡ����������ʱ��ȿ�������������ã�Ҳ��������š�
        String outPut = "";
        
        outPut = outPut + "<b>" + fileName + "</b><br>";
        outPut = outPut + "��һ��sheet������Ϊ��" + sheet.getName() + "<br>";
        outPut = outPut + "��һ��sheet���У�" + sheet.getRows() + "��" + sheet.getColumns() + "��<br>";
        outPut = outPut + "�����������£�<br>";
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