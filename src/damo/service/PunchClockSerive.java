package damo.service;

import java.util.List;

import damo.pojo.PunchClockBean;

public interface PunchClockSerive {

	public void beginPunchClock(PunchClockBean punchClockBean);// 插入打卡时间

	public PunchClockBean findOnePunchClock(String userCode);// 查找一条数据
	public List<PunchClockBean> findListPunchClock(String userCode);// 查找多条条数据

	public void endPunchClock(PunchClockBean punchClockBean);// 结束打卡

	public PunchClockBean AnythingDatePunchClock(String someone, String beginTime, String endTime, String anything);// 随便查找

	public PunchClockBean findBusinessDatePunchClock(String userCode, String businessData);// 有用户code

	public String computerTime(String businessData, String closingTime);
}
