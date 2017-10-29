package damo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import damo.mapper.PunchClockMapper;
import damo.pojo.PunchClockBean;
import damo.service.PunchClockSerive;
import damo.util.method.UtilTemple;
import damo.util.method.UtilTempleMain;

@Service
public class PunchClockSeriveImpl implements PunchClockSerive {
	@Autowired
	private PunchClockMapper punchClockMapper;

	// 插入打卡时间
	@Override
	public void beginPunchClock(PunchClockBean punchClockBean) {
		punchClockMapper.addPunchClock(punchClockBean);

	}
	// 有用户code 和 当天下班时间 查找 记录

	@Override
	public PunchClockBean findBusinessDatePunchClock(String userCode, String businessData) {
		return punchClockMapper.findOnePunchClock(userCode, businessData);
	}

	// 计算时长
	@Override
	public String computerTime(String businessData, String closingTime) {
		UtilTempleMain UT = new UtilTemple();

		return Integer.toString(UT.Date_yMdhms_between_H(businessData, closingTime) / 60);

	}

	// 结束打卡
	@Override
	public void endPunchClock(PunchClockBean punchClockBean) {
		punchClockMapper.updatePunchClock(punchClockBean);

	}

	// 查找一条数据
	@Override
	public PunchClockBean findOnePunchClock(String userCode) {
		return punchClockMapper.findOnePunchClockString(userCode);
	}

	// 随便查找
	@Override
	public PunchClockBean AnythingDatePunchClock(String someone, String beginTime, String endTime, String anything) {
		return punchClockMapper.AnythingDatePunchClock(someone, beginTime, endTime, anything);
	}

	@Override
	public List<PunchClockBean> findListPunchClock(String userCode) {
		return punchClockMapper.findListPunchClockString(userCode);
	}

}
