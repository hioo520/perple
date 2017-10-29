package damo.util.method;

import java.util.Date;
import java.util.List;

import damo.util.method.methodType.UtilMD5;
import damo.util.method.methodType.UtilMail;
import damo.util.method.methodType.UtilName;
import damo.util.method.methodType.UtilRandomDate;
import damo.util.method.methodType.UtilSimpleDate;
import damo.util.method.methodType.paging.PagingBean;
import damo.util.method.methodType.paging.PagingService;

public class UtilTemple implements UtilTempleMain {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.getDate());
		System.out.println(date.getYear());
		System.out.println(date.getTime());
		System.out.println(new UtilTemple().Date_yMdhms() + "************************");
		System.out.println(new UtilTemple().acheiveName());
		System.out.println(new UtilTemple().generateString(1));

		System.out.println(new UtilTemple().generateMixString(13));

		System.out.println(new UtilTemple().generateLowerString(13));

		System.out.println(new UtilTemple().generateUpperString(13));

		System.out.println(new UtilTemple().generateZeroString(6));

		System.out.println(new UtilTemple().toFixdLengthString(99, 2));// 模板数据
		System.out.println(new UtilTemple().generateNumber(1));
		System.out.println(new UtilTemple().MD5("123"));
		System.out
				.println("差 " + new UtilTemple().Date_yMdhms_between_H("2017-12-12 1:2:0", "2017-12-12 0:0:0") + "分钟");// 差一分钟
	}

	private UtilName uN;
	private UtilRandomDate uD;
	private UtilMD5 uM;
	private UtilSimpleDate uSD;
	private PagingService pS;
	private UtilMail uMail;

	public UtilTemple() {
		this.uD = new UtilRandomDate();
		this.uN = new UtilName();
		this.uM = new UtilMD5();
		this.uSD = new UtilSimpleDate();
		this.pS = new PagingService();
	}

	public UtilTemple(PagingBean pagingBean) {// 注入PagingService

		this.pS = new PagingService(pagingBean);
	}

	public UtilTemple(String sendMainName, String sendAuthorize, String sendWhoName, String sendToName,
			String sendTheme, String sendContent) {// 注入PagingService

		this.uMail = new UtilMail(sendMainName, sendAuthorize, sendWhoName, sendToName, sendTheme, sendContent);
	}

	@Override
	public String acheiveName() {
		return uN.acheiveName();
	}// 生成姓名三个字

	@Override
	public String generateString(int number) {
		return uD.generateString(number);
	}

	@Override
	public String generateMixString(int number) {
		return uD.generateMixString(number);
	}

	@Override
	public String generateLowerString(int number) {
		return uD.generateLowerString(number);
	}

	@Override
	public String generateUpperString(int number) {
		return uD.generateUpperString(number);
	}

	@Override
	public String generateZeroString(int number) {
		return uD.generateZeroString(number);
	}

	@Override
	public String toFixdLengthString(long num, int fixdlenth) {
		return uD.toFixdLengthString(num, fixdlenth);
	}

	@Override
	public String toFixdLengthString(int num, int fixdlenth) {
		return uD.toFixdLengthString(num, fixdlenth);
	}

	@Override
	public String generateNumber(int length) {
		return uD.generateNumber(length);
	}

	@Override
	public String MD5(String plainText) {
		return uM.MD5(plainText);
	}

	@Override
	public String ComputerTime(String businessData, String closingTime) {
		return null;
	}

	@Override
	public String Date_yMdhms() {
		return uSD.Date_yMdhms();
	}

	@Override
	public int Date_yMdhms_between_H(String startTime, String endTime) {
		return uSD.Date_yMdhms_between_H(startTime, endTime);
	}

	// 翻页效果
	@Override
	public int[] nowPage(Integer showpages) {

		return pS.nowPage(showpages);
	}

	@Override
	public int[] firstPage(Integer showpages) {

		return pS.firstPage(showpages);
	}

	@Override
	public int[] lasttPage(Integer showpages) {

		return pS.lasttPage(showpages);
	}

	@Override
	public List<Object> allPage(Integer firstPage, Integer lastPage, Integer showpages) {

		return pS.allPage(firstPage, lastPage, showpages);
	}

	@Override
	public int[] upPage(Integer firstpage, Integer showpages) {

		return pS.upPage(firstpage, showpages);
	}

	@Override
	public int[] nextPage(Integer last_page, Integer showpages) {

		return pS.nextPage(last_page, showpages);
	}

	public int nowingPage(Integer lastPage, Integer showpages) {
		return pS.nowingPage(lastPage, showpages);
	}

	public int upPages(Integer firstPage, Integer showpages) {
		return pS.upPages(firstPage, showpages);
	}

	public int nextPages(Integer lastPage, Integer showpages) {
		return pS.nextPages(lastPage, showpages);
	}

	public void sendemail() {
		uMail.sendemail();
	};
}
