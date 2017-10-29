package damo.test.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import damo.mapper.UserDetaildeMapper;
import damo.mapper.UserMapper;
import damo.pojo.User;
import damo.pojo.UserDetailde;
import damo.util.method.UtilTemple;
import damo.util.method.UtilTempleMain;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext*.xml" })
public class UserDetaildeMapperTest {
	@Autowired
	private UserDetaildeMapper userDetaildeMapper;
	@Autowired
	private UserMapper userMapper;

	@Test
	public void testAddUserDetailde() {
		for (int i = 0; i < 50; i++) {

			UserDetailde ud = new UserDetailde();//
			UtilTempleMain un = new UtilTemple();// 引入工具包
			User u = new User();
			ud.setId(un.generateNumber(1));
			ud.setPassword(un.generateMixString(6));
			ud.setUser_name(un.acheiveName());
			ud.setReal_name(un.acheiveName());
			ud.setMobile(un.generateNumber(11));
			ud.setEmail(un.generateMixString(3) + "@163.com");
			ud.setPassword_question(un.acheiveName());
			ud.setPassword_hint_answer(un.generateMixString(4));
			ud.setAuth(un.generateNumber(1));
			String templ = ud.getUser_name() + ud.getPassword() + ud.getId();// 设置md5
																				// 复杂度
			u.setUser_code(un.MD5(templ));// 唯一标识
			ud.setUniqueness_code(u.getUser_code());
			u.setUser_authority(ud.getAuth());
			u.setUser_state(ud.getId());
			u.setUser_name(ud.getUser_name());
			u.setUser_password(ud.getPassword());
			ud.setPicture(un.generateMixString(3) + ".png");
			int temp = userMapper.userAdd(u);
			System.out.println("@@@@@" + temp);
			System.out.println(ud);
			userDetaildeMapper.addUserDetailde(ud);
			System.out.println("124");
			// `user_id`, `u.setUser_code`, `u.setUser_name`,
			// `u.setUser_password`, `u.setUser_state`, `user_authority
		}
	}

	@Test
	public void testgetUserDetailde() {

		UserDetailde tem = userDetaildeMapper.getUserDetailde(45);
		System.out.println(tem);
	}

	@Test
	public void testFindOneUserDetailde() {

		UserDetailde tem = userDetaildeMapper.findOneUserDetailde("45");
		System.out.println(tem);
	}

	@Test
	public void testUserDetaildeService() {
		UserDetailde uD = new UserDetailde("5", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1");
		userDetaildeMapper.alertOneUserDetailde(uD);
	}
	// findOneUserDetailde(user.getUser_id());.alertOneUserDetailde(uD);
}
