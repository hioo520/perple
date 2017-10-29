package damo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import damo.pojo.User;
import damo.pojo.UserDetailde;
import damo.service.UserDetaildeService;
import damo.service.UserService;

// 处理关于一切用户数据
@Controller
@RequestMapping("")
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	private UserDetaildeService userDetaildeService;

	// 检索登录用户 包括root用户
	@RequestMapping("login")
	public String userLogin(String name, String password, HttpSession session, HttpServletRequest request,
			Model model) {
		User userTemp = userService.login(name, password);
		if (userTemp != null) {
			if (userTemp.getUser_name().equals("root")) {// 权限名判断
				session.setAttribute("_ROOT_", userTemp);
				model.addAttribute("_LOGIN_OK_", "userTemp");
				// session.setAttribute("_LOGIN_OK_", "登录成功");
			}
			session.setAttribute("_USER_", userTemp);
			model.addAttribute("_USER_", "userTemp");
		} else {
			model.addAttribute("_USER_", "false");
		}
		return "index";
	}

	// 注册用户信息
	@RequestMapping("regedit")
	public String userRegedit(User user, Model model) {
		// System.out.println("@@@@@@@@@@用户注册：" + user);
		Integer userTemp = userService.regedit(user);
		model.addAttribute("msg", "登录成功");
		if (userTemp == 1) {
			model.addAttribute("_USER_", userTemp);
		} else {
			model.addAttribute("_USER_", "");
		}
		return "user/login_ok";
	}

	// 用户离开
	@RequestMapping("getaway")
	public String getaway(HttpServletRequest request, HttpSession session, Model m) {
		session.removeAttribute("_USER_");
		request.getSession().invalidate();
		return "user/login";
	}

	// 遍历所有数据
	@RequestMapping("alluser")
	public String alluser(Model model) {
		// System.out.println("@@@遍历所有用户数据");
		List<User> user = userService.findAllUser();
		model.addAttribute("_ALLUSER_", user);
		return "user/show_user";

	}

	// 查找一个用户
	@RequestMapping("reviseUser")
	public String findOneUser(String id, Model model) {
		User user = userService.findOneUser(id);
		model.addAttribute("_ONEUSER_", user);
		return "user/alert_user";
	}

	// 更改一个用户
	@RequestMapping("admitAlertUser")
	public String alertOneUser(User user, Model model) {
		// 查找用户详细的数据 以备更改特定数据
		// System.out.println("@1@ " + user);
		UserDetailde uD = userDetaildeService.findOneUserDetailde(user.getUser_code());// a3ff187e89e016d1a161f98e59ad02ec
		// System.out.println("@2@ " + uD);
		uD.setUser_name(user.getUser_name());
		uD.setPassword(user.getUser_password());
		uD.setAuth(user.getUser_authority());
		// System.out.println("@3@ " + uD);
		// 开始同步插入数据
		userService.alertOneUser(user);
		userDetaildeService.alertOneUserDetailde(uD);
		return alluser(model);
	}

}
