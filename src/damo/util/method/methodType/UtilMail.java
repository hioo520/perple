package damo.util.method.methodType;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;

public class UtilMail{
	public static void main(String[] args) {
		UtilMail utilMail = new UtilMail("damoyuangmain@163.com","952795279527m","damoyuangmain@163.com","damoyuangmain@163.com","我爱你","爱我吗");
		for(int i= 0;i<2;i++){
			
			utilMail.sendemail();
		}
	}
	private static String sendMainName;//发送邮件的地址damoyuangmain@163.com// 认证信息，需要提供"用户账号","授权码" 密码952795279527m
	private static String sendAuthorize;//"授权码"952795279527m"
	private static String sendWhoName;// 邮件发送者  
	private static String sendToName;// 邮件接受者  
	private static String sendTheme; // 邮件主题  
	private static String sendContent;//// 邮件主体内容
	public UtilMail(String sendMainName,String sendAuthorize,String sendWhoName,String sendToName,String sendTheme,String sendContent) {
		UtilMail.sendMainName=sendMainName;
		UtilMail.sendAuthorize=sendAuthorize;
		UtilMail.sendWhoName=sendWhoName;
		UtilMail.sendToName=sendToName;
		UtilMail.sendTheme=sendTheme;
		UtilMail.sendContent=sendContent;
		
	}
/*
	 * "<html><head></head><body><h1>请点击连接激活</h1><h3><a href='http://localhost:8080/active?code="  
        + "激活码" + "'>http://localhost:8080/active?code=" + "123激活码" + "</href></h3></body></html>"
	 * 
	 * 
	 */
public  void sendemail() { 
	
  // 配置  
  Properties prop=new Properties();  
  // 设置邮件服务器主机名，这里是163  
  prop.put("mail.host","smtp.163.com" );  
  // 发送邮件协议名称  
  prop.put("mail.transport.protocol", "smtp");  
  // 是否认证  
  prop.put("mail.smtp.auth", true);  
  
  try {  
    // SSL加密  
    MailSSLSocketFactory sf = null;  
    sf = new MailSSLSocketFactory();  
    // 设置信任所有的主机  
    sf.setTrustAllHosts(true);  
    prop.put("mail.smtp.ssl.enable", "true");  
    prop.put("mail.smtp.ssl.socketFactory", sf);  
  
    // 创建会话对象  
    Session session = Session.getDefaultInstance(prop, new Authenticator() {  
      // 认证信息，需要提供"用户账号","授权码"  
      public PasswordAuthentication getPasswordAuthentication() {  
        return new PasswordAuthentication(sendMainName, sendAuthorize);  
      }  
    });  
    // 是否打印出debug信息  
    session.setDebug(true);  
  
    // 创建邮件  
    Message message = new MimeMessage(session);  
    // 邮件发送者  
    message.setFrom(new InternetAddress(sendWhoName));  
    // 邮件接受者  
    message.addRecipient(Message.RecipientType.TO, new InternetAddress(sendToName));  
    // 邮件主题  
    message.setSubject(sendTheme);  
    String content = sendContent;  
    message.setContent(content, "text/html;charset=UTF-8");  
    // Transport.send(message);  
    // 邮件发送  
    Transport transport = session.getTransport();  
    transport.connect();  
    transport.sendMessage(message, message.getAllRecipients());  
    transport.close();  
  } catch (Exception e) {  
    e.printStackTrace();  
  }  
}
public UtilMail() {
}

public static void setSendMainName(String sendMainName) {
	UtilMail.sendMainName = sendMainName;
}
public static void setSendAuthorize(String sendAuthorize) {
	UtilMail.sendAuthorize = sendAuthorize;
}
public static void setSendWhoName(String sendWhoName) {
	UtilMail.sendWhoName = sendWhoName;
}
public static void setSendToName(String sendToName) {
	UtilMail.sendToName = sendToName;
}
public static void setSendTheme(String sendTheme) {
	UtilMail.sendTheme = sendTheme;
}
public static void setSendContent(String sendContent) {
	UtilMail.sendContent = sendContent;
}  
}