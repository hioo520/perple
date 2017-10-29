package damo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import damo.pojo.User;
import damo.pojo.UserDetailde;
import damo.service.UserDetaildeService;
import damo.service.UserService;
import damo.util.method.UtilTemple;
import damo.util.method.UtilTempleMain;

@Controller
@RequestMapping("")
public class UserDetaildeController {// 同时插入两个数据库 主要是插入数据
	@Autowired
	private UserDetaildeService userDetaildeService;
	@Autowired
	private UserService userService;

	@RequestMapping("register_userDetailde")
	public String userDetaildeRegedit(UserDetailde userDetailde, Model model) {
		User u = new User();
		UtilTempleMain uT = new UtilTemple();
		String temple = userDetailde.getUser_name() + userDetailde.getMobile() + userDetailde.getMobile();
		u.setUser_code(uT.MD5(temple));// 设置唯一标识
		u.setUser_name(userDetailde.getUser_name());
		u.setUser_password(userDetailde.getPassword());
		u.setUser_state("0"); // userDetailde.getId()
		u.setUser_authority(userDetailde.getAuth());
		userDetailde.setUniqueness_code(u.getUser_code());// 设置 用户的详细唯一标识
		userDetailde.setPicture(uT.generateMixString(3) + ".png");// 设置 默认图片
		int userRegedit = userService.regedit(u);
		System.out.println(userDetailde.toString());
		Integer regedit = userDetaildeService.regedit(userDetailde);
		System.out.println(regedit == 1 && userRegedit == 1 ? "插入成功" : "插入失败");
		model.addAttribute("_regedit_", "注册成功");
		return "index";

	}

	// 删除一条数据
	@SuppressWarnings("finally")
	@RequestMapping("deleOnetUser")
	public String deleOnetUser(String id, Model model) {
		try {
			userDetaildeService.deleOnetUser(id);
			userService.deleOnetUser(id);
		} catch (Exception e) {
			e.toString();
			System.out.println("删除失败");
		} finally {
			
			return "alluser";
		}

	}
	// user_name=77&password=7665&re_password=567&real_name=7657&mobile=7657&email=56756&password_question=7675&password_hint_answer=7567&auth=1
}
