package damo.test.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import damo.mapper.PunchClockMapper;
import damo.pojo.PunchClockBean;
import damo.util.method.UtilTemple;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext*.xml" })

public class PunchClockMapperTest {
	@Autowired
	private PunchClockMapper punchClockMapper;

	@Test
	public void testAddPunchClock() {// 批处理生成数据模拟打卡
		UtilTemple UT = new UtilTemple();
		for (int j = 0; j <= 15; j++) {

			String start = UT.Date_yMdhms();
			String end = UT.Date_yMdhms();// 2017-10-22 11:00:21
			// 默认加7个小时 // 工作时长
			int i;
			try {
				i = Integer.valueOf(end.substring(10, 13)) + 7;
			} catch (NumberFormatException e) {
				i = Integer.valueOf(end.substring(11, 13)) + 7;
			}
			String ends = end.substring(0, 10) + " " + i + end.substring(13, 19);// 从新拼接加入7小时

			int duration = UT.Date_yMdhms_between_H(start, ends);// 获取多少秒

			int h = duration / 60;
			System.out.println(h);
			int hs = duration % 60;
			System.out.println(hs);
			String hh = h + "." + hs;
			System.out.println(hh);

			PunchClockBean punchClockBean = new PunchClockBean(UT.MD5(UT.Date_yMdhms() + Math.random()), start, ends,
					hh);
			punchClockMapper.addPunchClock(punchClockBean);// 打卡
			punchClockMapper.updatePunchClock(punchClockBean);// 走人
		}
	}

	@Test
	public void testaddPunchClock() {// 模拟打卡
		UtilTemple UT = new UtilTemple();
		PunchClockBean punchClockBean = new PunchClockBean();
		punchClockBean.setUserCode(UT.MD5(UT.Date_yMdhms()));

		punchClockBean.setBusinessData(UT.Date_yMdhms());
		try {
			punchClockMapper.addPunchClock(punchClockBean);
		} catch (Exception e) {
			e.toString();
		}
		System.out.println("打卡成功");
	}
	// addPunchClock
	// punchClockSerive.beginPunchClock(punchClockbean);// 插入时间上班时间

	@Test
	public void testfindOnePunchClock() {// 返回个人出勤记录
		PunchClockBean punchclock = punchClockMapper.findOnePunchClock("a13e31e1ee77030cfa65c77bcd7701c0",
				"2017-10-25");
		// SELECT * FROM punchclock WHERE usercode
		// ="a13e31e1ee77030cfa65c77bcd7701c0" AND businessdata LIKE
		// '2017-10-25%'
		System.out.println(punchclock);
	}

	@Test
	public void testFindListPunchClock() {// 返回个人出勤记录
		List<PunchClockBean> punchclock = punchClockMapper.findListPunchClock("15f83296a55bb6f9bb77329a5c6ad8b7",
				"2017-10-22 09:01:43");
		for (PunchClockBean b : punchclock) {

			System.out.println(b.toString());
		}
	}

	@Test
	public void testUpdatePunchClock() {// updatePunchClock//测试走人
		UtilTemple UT = new UtilTemple();
		PunchClockBean punchClockBean = new PunchClockBean();
		punchClockBean.setUserCode(UT.MD5(UT.Date_yMdhms()));

		punchClockBean.setClosingTime(UT.Date_yMdhms());
		punchClockBean.setDuration("10.9");
		punchClockMapper.updatePunchClock(punchClockBean);
	}
	@Test
	public void testpagingUserLimit() {// 返回个人出勤记录
		List<PunchClockBean> punchclock = punchClockMapper.pagingUserLimit("0",
				"3");
		for (PunchClockBean b : punchclock) {

			System.out.println(b.toString());
		}
	}
	@Test
	public void testpagingUserCount() {// 返回个人出勤记录
		System.out.println(punchClockMapper.pagingUserCount());
		
	}
	@Test
	public void testpagingUserDefault() {// 返回个多少条人出勤记录
		List<PunchClockBean> punchclock = punchClockMapper.pagingUserDefault(6);
		for (PunchClockBean b : punchclock) {

			System.out.println(b.toString());
		}
	}
	
}
