package damo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import damo.pojo.PunchClockBean;

public interface PunchClockMapper {

	public void addPunchClock(PunchClockBean punchClockBean);// 插入上班时间

	public List<PunchClockBean> findOnePunchClockLike(@Param("userCode") String userCode,
			@Param("businessData") String businessData);

	public PunchClockBean findOnePunchClock(@Param("userCode") String userCode,
			@Param("businessData") String businessData);// 查看当天开始打卡记录

	public List<PunchClockBean> findListPunchClock(@Param("userCode") String userCode,
			@Param("businessData") String businessData);

	public void updatePunchClock(PunchClockBean punchClockBean);// 走人打卡

	public PunchClockBean findOnePunchClockString(String userCode);// 返回当前用户的打卡记录
	public List<PunchClockBean> findListPunchClockString(String userCode);// 返回当前用户的打卡多条记录

	public PunchClockBean AnythingDatePunchClock(String someone, String beginTime, String endTime, String anything);
	
	
//	分页内容
	public List<PunchClockBean> pagingUserDefault(int id);

	public List<PunchClockBean> pagingUserLimit(@Param("begin") String begin, @Param("end") String end);

	public int pagingUserCount();

}
