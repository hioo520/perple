package damo.service;

import java.util.List;

import damo.pojo.User;

public interface UserService {
	User login(String name, String password);

	List<User> findAllUser();

	Integer regedit(User user);

	User findOneUser(String id);

	void deleOnetUser(String id);

	void alertOneUser(User user);// 修改用户信息
}
