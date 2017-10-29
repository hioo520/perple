package damo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import damo.pojo.PunchClockBean;
import damo.pojo.User;
import damo.service.PunchClockSerive;
import damo.util.method.UtilTemple;
import damo.util.method.UtilTempleMain;

@Controller
@RequestMapping("")
public class PunchTheClockController {// 同时插入两个数据库 主要是插入数据
	@Autowired
	private PunchClockSerive punchClockSerive;

	// 打卡签到
	@RequestMapping("punchTheClock")
	public String punchTheClock(PunchClockBean punchClockbean, HttpSession HS, Model model) {
		User user = (User) HS.getAttribute("_USER_");// 查找用户code
		punchClockbean.setUserCode(user.getUser_code());
		UtilTempleMain UT = new UtilTemple();
		// 防止重复打卡
		String leavetime = UT.Date_yMdhms();// 2017-10-22 11:00:21
		String leaveTimeTempl = leavetime.substring(0, leavetime.length() - 9);// 2017-10-22
		PunchClockBean pC = punchClockSerive.findBusinessDatePunchClock(user.getUser_code(), leaveTimeTempl);// 由登录用户的code和time查找当天打卡记录
		punchClockbean.setBusinessData(UT.Date_yMdhms());
		try {
			if (pC == null) {
				punchClockSerive.beginPunchClock(punchClockbean);// 插入时间上班时间
				model.addAttribute("_PUNCH_OK_", "已经打卡了");
				System.out.println("打卡成功");
			} else {
				System.out.println("已卡成功");
			}
		} catch (Exception e) {
			e.getMessage();
			return "index";
		}
		// model.addAttribute("_PUNCH_OK_","打卡了OK");
		return "index";

	}

	// 退卡签到
	@RequestMapping("leave")
	public String leaves(HttpSession HS, Model m) {
		User user = (User) HS.getAttribute("_USER_");
		UtilTempleMain UT = new UtilTemple();
		String leavetime = UT.Date_yMdhms();// 2017-10-22 11:00:21
		String leaveTimeTempl = leavetime.substring(0, leavetime.length() - 9);// 2017-10-22
		PunchClockBean pC = punchClockSerive.findBusinessDatePunchClock(user.getUser_code(), leaveTimeTempl);// 由登录用户的code和time查找考勤记录
		// 输出时间PunchClockBean [userCode=15f83296a55bb6f9bb77329a5c6ad8b7,
		// businessData=2017-10-22 10:59:54.0, closingTime=1111-11-11
		// 01:01:01.0, duration=0.00]
		// 默认加7个小时 // 工作时长
		int i;
		try {
			i = Integer.valueOf(leavetime.substring(10, 13)) + 7;
		} catch (NumberFormatException e) {
			i = Integer.valueOf(leavetime.substring(11, 13)) + 7;
		}
		String le = leavetime.substring(0, 10) + " " + i + leavetime.substring(13, 19);// 从新拼接加入7小时
		leavetime = le;// 重置时间
		String duration = punchClockSerive.computerTime(pC.getBusinessData(), leavetime);
		pC.setClosingTime(le);// 正确时间是 leavetime
		pC.setDuration(duration + ".0");
		try {
			punchClockSerive.endPunchClock(pC);// 插入下班和工作时长
		} catch (Exception e) {
			e.getMessage();
			return "index";
		}
		m.addAttribute("_PUNCH_LEAVE_", "12345");
		System.out.println("退卡成功");
		return "index";
	}

	//
	// 遍历当前用户几乎出勤记录
	@RequestMapping("findOnePunchClock")
	public String findOnePunchClock(HttpSession HS, Model model) {
		User user = (User) HS.getAttribute("_USER_");
		List<PunchClockBean> pC = punchClockSerive.findListPunchClock(user.getUser_code());
		// [PunchClockBean [userCode=15f83296a55bb6f9bb77329a5c6ad8b7,
		// businessData=2017-10-27 03:38:55.0, closingTime=2017-10-27
		// 10:46:03.0, duration=7.00]]
		model.addAttribute("_PUNCHCLOCK_", pC);
		return "jsp/punchclock";

	}

	// 查找特定人的用户的特定时间出勤记录 root 自定义查询
	@RequestMapping("AnythingDatePunchClock")
	public String leave(HttpSession HS, Model model) {
		User user = (User) HS.getAttribute("_USER_");
		// if()
		String someone = user.getUser_code();
		String beginTime = null;
		String endTime = null;
		String anything = null;
		PunchClockBean pC = (PunchClockBean) punchClockSerive.AnythingDatePunchClock(someone, beginTime, endTime,
				anything);
		model.addAttribute("_punchclock_", pC);
		return "index";

	}

}
