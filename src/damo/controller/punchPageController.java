package damo.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import damo.mapper.PunchClockMapper;
import damo.pojo.PunchClockBean;
import damo.util.method.UtilTemple;
import damo.util.method.UtilTempleMain;
import damo.util.method.methodType.UtilExcel;
import damo.util.method.methodType.paging.PagingBean;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

@Controller
@RequestMapping("")
public class punchPageController {
	// @Autowired
	// UserService userService;
	@Autowired
	private PunchClockMapper pagingMapper;
	private int Defaultpage = 5;// 默认设置显示五条

	// 分页所有数据 默认五条头
	@RequestMapping("punchDefault")
	public String PageDefault(Model model) {
		List<PunchClockBean> Default = pagingMapper.pagingUserDefault(Defaultpage);// 默认设置显示五条
		int count_page = pagingMapper.pagingUserCount();// 总共多少条
		int[] inner = new int[] { 0, Defaultpage - 1 };
		List<Object> in = new ArrayList<Object>();
		in.add(inner);
		PagingBean pagingBean = new PagingBean(Integer.valueOf(Defaultpage), Integer.valueOf(0),
				Integer.valueOf(Defaultpage - 1), Integer.valueOf(1), Integer.valueOf(count_page), in);
		model.addAttribute("__PAGEING_USER_", Default);
		model.addAttribute("__PAGEING_", pagingBean);
		return "user/show_user_punch";

	}

	/*
	 * 自定义设置一个页面多少条数据
	 * 
	 * @pageNumber 自定义分页数目 pageNumber条
	 * 
	 */
	@RequestMapping("punchNumber")
	public String pageNumber(PagingBean paginBean, Model model) {

		UtilTempleMain UT = new UtilTemple(paginBean);// 引入工具箱 并且注入 pageingBean
		List<PunchClockBean> Default = pagingMapper.pagingUserDefault(paginBean.getDefaul_page());// 自定义显示条数
		int count_page = pagingMapper.pagingUserCount();// 总共多少条
		int[] inner = new int[] { 0, paginBean.getDefaul_page() - 1 };
		List<Object> in = new ArrayList<Object>();
		in.add(inner);
		PagingBean pagingBean = new PagingBean(paginBean.getDefaul_page(), paginBean.getFirst_page(),
				paginBean.getDefaul_page() - 1, UT.nowingPage(paginBean.getLast_page(), paginBean.getDefaul_page()),
				count_page, paginBean.getAll_page());
		model.addAttribute("__PAGEING_USER_", Default);
		model.addAttribute("__PAGEING_", pagingBean);
		return "user/show_user_punch";

	}

	@RequestMapping("punchNext")
	public String pageNext(PagingBean paginBean, Model model) {
		Integer getLast_pages = (paginBean.getCount_page() == paginBean.getLast_page()) ? paginBean.getFirst_page()
				: paginBean.getLast_page();// 判断是否到下一页底部
		UtilTempleMain UT = new UtilTemple(paginBean);// 引入工具箱 并且注入 pageingBean
		List<PunchClockBean> Default = pagingMapper.pagingUserLimit(Integer.toString(getLast_pages),
				Integer.toString(paginBean.getDefaul_page()));// 自定义显示条数
		int count_page = pagingMapper.pagingUserCount();// 总共多少条
		int[] inner = new int[] { 0, paginBean.getDefaul_page() - 1 };
		List<Object> in = new ArrayList<Object>();
		in.add(inner);
		PagingBean pagingBean = new PagingBean(paginBean.getDefaul_page(), getLast_pages,
				UT.nextPages(paginBean.getLast_page(), paginBean.getDefaul_page()),
				UT.nowingPage(paginBean.getLast_page() + paginBean.getDefaul_page(), paginBean.getDefaul_page()),
				count_page, paginBean.getAll_page());
		model.addAttribute("__PAGEING_USER_", Default);
		model.addAttribute("__PAGEING_", pagingBean);
		return "user/show_user_punch";

	}

	@RequestMapping("punchUp")
	public String pageUp(PagingBean paginBean, Model model) {
		Integer getFirst_pages = (0 == paginBean.getFirst_page()) ? paginBean.getDefaul_page() - 1
				: paginBean.getFirst_page();// 判断是否到上一页顶部
		UtilTempleMain UT = new UtilTemple(paginBean);// 引入工具箱 并且注入 pageingBean
		List<PunchClockBean> Default = pagingMapper.pagingUserLimit(Integer.toString(paginBean.getFirst_page()),
				Integer.toString(paginBean.getDefaul_page()));// 自定义显示条数
		int count_page = pagingMapper.pagingUserCount();// 总共多少条
		int[] inner = new int[] { 0, paginBean.getDefaul_page() - 1 };
		List<Object> in = new ArrayList<Object>();
		in.add(inner);
		PagingBean pagingBean = new PagingBean(paginBean.getDefaul_page(),
				UT.upPages(paginBean.getFirst_page(), paginBean.getDefaul_page()), getFirst_pages,
				UT.nowingPage(paginBean.getFirst_page(), paginBean.getDefaul_page()), count_page,
				paginBean.getAll_page());
		model.addAttribute("__PAGEING_USER_", Default);
		model.addAttribute("__PAGEING_", pagingBean);
		return "user/show_user_punch";
	}

	@RequestMapping("punchFirst")
	public String pageFirst(PagingBean paginBean, Model model) {
		List<PunchClockBean> Default = pagingMapper.pagingUserDefault(paginBean.getDefaul_page());// 默认设置显示五条
		int count_page = pagingMapper.pagingUserCount();// 总共多少条
		int[] inner = new int[] { 0, Defaultpage - 1 };
		List<Object> in = new ArrayList<Object>();
		in.add(inner);
		PagingBean pagingBean = new PagingBean(paginBean.getDefaul_page(), Integer.valueOf(0),
				Integer.valueOf(Defaultpage - 1), Integer.valueOf(1), Integer.valueOf(count_page), in);
		model.addAttribute("__PAGEING_USER_", Default);
		model.addAttribute("__PAGEING_", pagingBean);
		return "user/show_user_punch";

	}

	@RequestMapping("punchLast")
	public String pageLast(PagingBean paginBean, Model model) {

		UtilTempleMain UT = new UtilTemple(paginBean);// 引入工具箱 并且注入 pageingBean
		List<PunchClockBean> Default = pagingMapper.pagingUserLimit(
				Integer.toString(paginBean.getCount_page() - paginBean.getDefaul_page()),
				Integer.toString(paginBean.getDefaul_page()));// 默认设置显示五条
		int count_page = pagingMapper.pagingUserCount();// 总共多少条
		int[] inner = new int[] { 0, Defaultpage - 1 };
		List<Object> in = new ArrayList<Object>();
		in.add(inner);
		PagingBean pagingBean = new PagingBean(paginBean.getDefaul_page(),
				paginBean.getCount_page() - paginBean.getDefaul_page(), paginBean.getCount_page(),
				UT.nowingPage(paginBean.getCount_page(), paginBean.getDefaul_page()), Integer.valueOf(count_page), in);
		model.addAttribute("__PAGEING_USER_", Default);
		model.addAttribute("__PAGEING_", pagingBean);
		return "user/show_user_punch";

	}

	// 发邮件
	@RequestMapping("sendEmal")
	public String sendEmal(String id, HttpSession HS, Model model) {
		String activationCode = "<h1>请点击</h1><br><h3>你的ID是:</h3><a href='http://192.168.1.103:8080/o/activationCode?code="
				+ id + "'>http://192.168.1.103:8080/o/activationCode?code=" + id + "</a>"
				+ "<a href='http://www.baidu.com'>去百度主页</a>";

		UtilTempleMain uT = new UtilTemple("damoyuangmain@163.com", "952795279527m", "damoyuangmain@163.com",
				"damoyuangmain@163.com", "大墨鱼网@的信使", "" + activationCode);// 加入工具包
		uT.sendemail();
		return " ";

	}

	/*
	 * 
	 * private Integer defaul_page;// 默认分页 每页多少条记录 private Integer first_page;//
	 * 当前分页的第一条记录下标 private Integer last_page;// 当前分页的最后一条记录下标 private Integer
	 * now_page;// 当前页码 private Integer count_page;// 总共多少条 private List<Object>
	 * all_page;// 分页数据集 public PagingBean(Integer defaul_page, Integer
	 * first_page, Integer last_page, Integer now_page, Integer count_page,
	 * List<Object> all_page)
	 * 
	 * userCode=" + userCode + "&businessData=" + businessData + "&closingTime=" + closingTime + "&duration=" + duration,
	 * 
	 */
	@RequestMapping("dowenExcel")
	public String emailDefault(PunchClockBean punchClockBean,HttpServletResponse response, Model model)
			throws RowsExceededException, WriteException, IOException {
		String fname = "大墨鱼网测试";
		OutputStream os = response.getOutputStream();// 取得输出流
		response.reset();// 清空输出流
//		List<PunchClockBean> Default = pagingMapper.pagingUserDefault(5);// 默认设置显示五条
		// List<PunchClockBean> p= pagingMapper().pagingUserDefault(10);
		// List<PunchClockBean> list=null;
		// 下面是对中文文件名的处理
		response.setCharacterEncoding("UTF-8");// 设置相应内容的编码格式
		fname = java.net.URLEncoder.encode(fname, "UTF-8");
		response.setHeader("Content-Disposition",
				"attachment;filename=" + new String(fname.getBytes("UTF-8"), "GBK") + ".xls");
		response.setContentType("application/msexcel");// 定义输出类型
		UtilExcel sw = new UtilExcel();
		sw.create(os, punchClockBean);

		// model.addAttribute("__PAGEING_USER_", Default);
		// model.addAttribute("__PAGEING_", pagingBean);
		 return "damoexcel";

	}
}
