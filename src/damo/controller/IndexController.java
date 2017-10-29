package damo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//该页返回页面
@Controller
@RequestMapping("")
public class IndexController {
	// 返回主页面
	@RequestMapping("index")
	// @RequestMapping(value={"index"})
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}

	// 返回登录界面
	@RequestMapping("login_web")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/login");
		return mav;
	}

	// 展示注册界面
	@RequestMapping("regedit_web")
	public ModelAndView regedit() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/regedit");
		return mav;
	}
	// 展示注册界面
		@RequestMapping("activationCode")
		public ModelAndView active() {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("header");
			return mav;
		}
		// 展示注册界面
				@RequestMapping("damoexcel")
				public ModelAndView damoexcel() {
					ModelAndView mav = new ModelAndView();
					mav.setViewName("../../damoexcel");
					return mav;
				}
		

}
