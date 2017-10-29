package damo.util.method.methodType;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class UtilSimpleDate {
	
	public static void main(String[] args) {
		String leavetime = "2017-10-22 09:13:40";
//		System.out.println(s1.length());
//		System.out.println(s1.substring(0,s1.length()-9));
//		System.out.println(Date_yMdhms_add_H("2017-0-0 20:31:00",0)-48*365*24*60*1000);
		
		int i;
		try {
			i = Integer.valueOf(leavetime.substring(10,13));
		} catch (NumberFormatException e) {
			i = Integer.valueOf(leavetime.substring(11,13));
		}
		System.out.println(i);
		String le = leavetime.substring(0,10)+" "+i+leavetime.substring(13,19);
		System.out.println(le);
		
//		16
//		2017-10-22 16:13:40
		
//		9
//		2017-10-22 9:13:40
	}

	public  String Date_yMdhms(){
		Date date = new Date();
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return s.format(date);
	}
	public static long Date_yMdhms_add_H(String startTime, int addTime) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
        Calendar cal = Calendar.getInstance();    
        long time1 = 0;
        try{
             cal.setTime(sdf.parse(startTime));   
             time1 = cal.getTimeInMillis(); 
             time1 +=addTime*1000*3600;
             
             
        }catch(Exception e){
            e.printStackTrace();
        }
            
       return time1;     
    }
	public static int Date_yMdhms_between_H(String startTime, String endTime) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
        Calendar cal = Calendar.getInstance();    
        long time1 = 0;
        long time2 = 0;
        
        try{
             cal.setTime(sdf.parse(startTime));   
             time1 = cal.getTimeInMillis(); 
             
             cal.setTime(sdf.parse(endTime)); 
             time2 = cal.getTimeInMillis(); 
        }catch(Exception e){
            e.printStackTrace();
        }
        long between_days=(time2-time1)/(1000*60);  
       return Integer.parseInt(String.valueOf(between_days));     
    }
	public static String format(long ms) {//将毫秒数换算成x天x时x分x秒x毫秒
		int ss = 1000;
		int mi = ss * 60;
		int hh = mi * 60;
		int dd = hh * 24;

		   long day = ms / dd;
		long hour = (ms - day * dd) / hh;
		long minute = (ms - day * dd - hour * hh) / mi;
		long second = (ms - day * dd - hour * hh - minute * mi) / ss;
		long milliSecond = ms - day * dd - hour * hh - minute * mi - second * ss;

		   String strDay = day < 10 ? "0" + day : "" + day;
		String strHour = hour < 10 ? "0" + hour : "" + hour;
		String strMinute = minute < 10 ? "0" + minute : "" + minute;
		String strSecond = second < 10 ? "0" + second : "" + second;
		String strMilliSecond = milliSecond < 10 ? "0" + milliSecond : "" + milliSecond;
		strMilliSecond = milliSecond < 100 ? "0" + strMilliSecond : "" + strMilliSecond;
		return strDay + " " + strHour + ":" + strMinute + ":" + strSecond + " " + strMilliSecond;
		}
}
