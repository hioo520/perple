package damo.util.method;

import java.util.List;

public interface UtilTempleMain  {
	/**
	 * 返回一个定长的随机字符串(只包含大小写字母、数字)
	 * 
	 * @param length
	 *            随机字符串长度
	 * @return 随机字符串
	 */
	public String generateString(int length);

	/**
	 * 返回一个定长的随机纯字母字符串(只包含大小写字母)
	 * 
	 * @param length
	 *            随机字符串长度
	 * @return 随机字符串
	 */
	public String generateMixString(int length);

	/**
	 * 返回一个定长的随机纯大写字母字符串(只包含大小写字母)
	 * 
	 * @param length
	 *            随机字符串长度
	 * @return 随机字符串
	 */
	public String generateLowerString(int length);

	/**
	 * 返回一个定长的随机纯小写字母字符串(只包含大小写字母)
	 * 
	 * @param length
	 *            随机字符串长度
	 * @return 随机字符串
	 */
	public String generateUpperString(int length);

	/**
	 * 生成一个定长的纯0字符串
	 * 
	 * @param length
	 *            字符串长度
	 * @return 纯0字符串
	 */
	public String generateZeroString(int length);

	/**
	 * 根据数字生成一个定长的字符串，长度不够前面补0
	 * 
	 * @param num
	 *            数字
	 * @param fixdlenth
	 *            字符串长度
	 * @return 定长的字符串
	 */
	public String toFixdLengthString(long num, int fixdlenth);

	/**
	 * 根据数字生成一个定长的字符串，长度不够前面补0
	 * 
	 * @param num
	 *            数字
	 * @param fixdlenth
	 *            字符串长度
	 * @return 定长的字符串
	 */
	public String toFixdLengthString(int num, int fixdlenth);

	/**
	 * 获取名字
	 * 
	 * @param 三位
	 * @param
	 * @return 字符串
	 */
	public String acheiveName();

	/**
	 * 返回一个定长的随机纯字母字符串(只包含大小写字母)
	 * 
	 * @param length
	 *            随机字符串长度
	 * @return 随机字符串
	 */
	public String generateNumber(int length);

	/**
	 * 返回一个定长的随机纯字母字符串(只包含大小写字母)
	 * 
	 * @param length
	 *            随机字符串长度
	 * @return 随机字符串
	 */
	public String MD5(String plainText);

	public String ComputerTime(String businessData, String closingTime);//计算时间长度
	public String Date_yMdhms();//2017-10-22 07:14:18
	public int Date_yMdhms_between_H(String startTime, String endTime);//计算相差多少分钟

	public int[] nowPage(Integer showpages);

	
	public int[] firstPage(Integer showpages);

	
	public int[] lasttPage(Integer showpages);

	
	public List<Object> allPage(Integer firstPage, Integer lastPage, Integer showpages);

	
	public int[] upPage(Integer firstpage, Integer showpages);

	
	public int[] nextPage(Integer lastpage, Integer showpages);
	public int nowingPage(Integer lastPage,Integer showpages) ;
	public int nextPages(Integer lastPage, Integer showpages) ;
	public int upPages(Integer firstPage, Integer showpages) ;
	public  void sendemail() ;
	
}
