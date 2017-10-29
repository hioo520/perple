package damo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import damo.mapper.PagingMapper;
import damo.pojo.User;
import damo.service.UserService;
import damo.util.method.UtilTemple;
import damo.util.method.UtilTempleMain;
import damo.util.method.methodType.paging.PagingBean;

@Controller
@RequestMapping("")
public class PagingController {
	@Autowired
	UserService userService;
	@Autowired
	private PagingMapper pagingMapper;
	private int Defaultpage = 5;// 默认设置显示五条

	// 分页所有数据 默认五条头
	@RequestMapping("pageDefault")
	public String PageDefault(Model model) {
		List<User> Default = pagingMapper.pagingUserDefault(Defaultpage);// 默认设置显示五条
		int count_page = pagingMapper.pagingUserCount();// 总共多少条
		int[] inner = new int[] { 0, Defaultpage - 1 };
		List<Object> in = new ArrayList<Object>();
		in.add(inner);
		PagingBean pagingBean = new PagingBean(Integer.valueOf(Defaultpage), Integer.valueOf(0),
				Integer.valueOf(Defaultpage - 1), Integer.valueOf(1), Integer.valueOf(count_page), in);
		model.addAttribute("__PAGEING_USER_", Default);
		model.addAttribute("__PAGEING_", pagingBean);
		return "user/show_user_paging";

	}

	/*
	 * 自定义设置一个页面多少条数据
	 * 
	 * @pageNumber 自定义分页数目 pageNumber条
	 * 
	 */
	@RequestMapping("pageNumber")
	public String pageNumber(PagingBean paginBean, Model model) {

		UtilTempleMain UT = new UtilTemple(paginBean);// 引入工具箱 并且注入 pageingBean
		List<User> Default = pagingMapper.pagingUserDefault(paginBean.getDefaul_page());// 自定义显示条数
		int count_page = pagingMapper.pagingUserCount();// 总共多少条
		int[] inner = new int[] { 0, paginBean.getDefaul_page() - 1 };
		List<Object> in = new ArrayList<Object>();
		in.add(inner);
		PagingBean pagingBean = new PagingBean(paginBean.getDefaul_page(), paginBean.getFirst_page(),
				paginBean.getDefaul_page() - 1, UT.nowingPage(paginBean.getLast_page(), paginBean.getDefaul_page()),
				count_page, paginBean.getAll_page());
		model.addAttribute("__PAGEING_USER_", Default);
		model.addAttribute("__PAGEING_", pagingBean);
		return "user/show_user_paging";

	}

	@RequestMapping("pageNext")
	public String pageNext(PagingBean paginBean, Model model) {
		Integer getLast_pages = (paginBean.getCount_page() == paginBean.getLast_page()) ? paginBean.getFirst_page()
				: paginBean.getLast_page();// 判断是否到下一页底部
		UtilTempleMain UT = new UtilTemple(paginBean);// 引入工具箱 并且注入 pageingBean
		List<User> Default = pagingMapper.pagingUserLimit(Integer.toString(getLast_pages),
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
		return "user/show_user_paging";

	}

	@RequestMapping("pageUp")
	public String pageUp(PagingBean paginBean, Model model) {
		Integer getFirst_pages = (0 == paginBean.getFirst_page()) ? paginBean.getDefaul_page() - 1
				: paginBean.getFirst_page();// 判断是否到上一页顶部
		UtilTempleMain UT = new UtilTemple(paginBean);// 引入工具箱 并且注入 pageingBean
		List<User> Default = pagingMapper.pagingUserLimit(Integer.toString(paginBean.getFirst_page()),
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
		return "user/show_user_paging";
	}

	@RequestMapping("pageFirst")
	public String pageFirst(PagingBean paginBean, Model model) {
		List<User> Default = pagingMapper.pagingUserDefault(paginBean.getDefaul_page());// 默认设置显示五条
		int count_page = pagingMapper.pagingUserCount();// 总共多少条
		int[] inner = new int[] { 0, Defaultpage - 1 };
		List<Object> in = new ArrayList<Object>();
		in.add(inner);
		PagingBean pagingBean = new PagingBean(paginBean.getDefaul_page(), Integer.valueOf(0),
				Integer.valueOf(Defaultpage - 1), Integer.valueOf(1), Integer.valueOf(count_page), in);
		model.addAttribute("__PAGEING_USER_", Default);
		model.addAttribute("__PAGEING_", pagingBean);
		return "user/show_user_paging";

	}

	@RequestMapping("pageLast")
	public String pageLast(PagingBean paginBean, Model model) {

		UtilTempleMain UT = new UtilTemple(paginBean);// 引入工具箱 并且注入 pageingBean
		List<User> Default = pagingMapper.pagingUserLimit(
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
		return "user/show_user_paging";

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
	 * 
	 * 
	 */
}
