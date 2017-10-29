package damo.test.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import damo.pojo.User;
import damo.pojo.UserDetailde;
import damo.service.UserDetaildeService;
import damo.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext*.xml" })
public class UserServiceImplTest {
	@Autowired
	private UserService userService;
	@Autowired
	private UserDetaildeService userDetaildeService;
	
	@Test
	public void testfindOneUserDetailde() {//测试根据根据user_code 查找用户信息
		UserDetailde userDetailde = userDetaildeService.findOneUserDetailde("a3ff187e89e016d1a161f98e59ad02ec");
		System.out.println(userDetailde);
	}
	@Test
	public void testalertOneUser() {
		User user = new User("1","a3ff187e89e016d1a161f98e59ad02ec","tom","password","1","0");
//		User(String user_id,
//		String user_code,
//		String user_name, 
//		String user_password,
//		String user_state,
//		String user_authority)
		try {
			userService.alertOneUser(user);
		} catch (Exception e) {
			e.toString();
		}
		System.out.println("插入成功");
	}
	@Test
	public void testalertOneUserDetailde() {
		UserDetailde uD = new UserDetailde("1","tom","password","tom","15366768053","email","2B","3B","0","tom.png","a3ff187e89e016d1a161f98e59ad02ec");
//		UserDetailde(String id, 
//				String user_name, 
//				String password, 
//				String real_name, 
//				String mobile, 
//				String email,
//				String password_question, 
//				String password_hint_answer, 
//				String auth, 
//				String picture,
//				String uniqueness_code)
		try {
			uD = new UserDetailde("1","tom","password","tom","15366768053","email","2B","3B","0","tom.png","a3ff187e89e016d1a161f98e59ad02ec");
			userDetaildeService.alertOneUserDetailde(uD);
		} catch (Exception e) {
			e.toString();
		}
		System.out.println("插入成功");
	}

	@Test
	public void testLogin() {
		User login = userService.login("root", "root");
		System.out.println(login);
	}

	@Test
	public void testRegedit() {
		User user = new User();
		user.setUser_id("3");
		user.setUser_code("m0001");
		user.setUser_name("小红8888");
		user.setUser_password("979");
		user.setUser_state("1");
		user.setUser_authority("0");
		int temp = userService.regedit(user);
		System.out.println("@@@@@" + temp);
	}

	@Test
	public void testFindAllUser() {
		List<User> findAllUser = userService.findAllUser();
		for (User u : findAllUser) {
			System.out.println(u);
		}
	}
	@Test
	public void testFindOneUser() {
		User user = userService.findOneUser("1");
		System.out.println(user);
	}

}
