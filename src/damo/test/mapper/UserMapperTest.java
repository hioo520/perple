package damo.test.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import damo.mapper.UserMapper;
import damo.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext*.xml" })
public class UserMapperTest {
	@Autowired
	private UserMapper userMapper;

	@Test
	public void testFind() {
		User userGet = userMapper.userGet("9");
		System.out.println("@@@@@" + userGet);
	}

	@Test
	public void testUserAdd() {
		User user = new User();
		user.setUser_id("3");
		user.setUser_code("m0001");
		user.setUser_name("小红8888");
		user.setUser_password("979");
		user.setUser_state("1");
		user.setUser_authority("0");
		int temp = userMapper.userAdd(user);
		System.out.println("@@@@@" + temp);
	}

	@Test
	public void testUserGet() {
		User U = userMapper.userLogin("root", "root");
		System.out.println(U);
	}

	@Test
	public void testuserLimit() {
		List<User> user = userMapper.userLimit("0", "5");
		for (User u : user) {

			System.out.println(u.toString());
		}
	}

	@Test
	public void testUserAlertOne() {
		User user = new User("1", "2", "3", "4", "5", "6");
		userMapper.userAlertOne(user);
	}

	@Test
	public void testuserAll() {
		List<User> user = userMapper.userAll();
		for (User u : user) {

			System.out.println(u.toString());
		}
	}
	// userAll
}
