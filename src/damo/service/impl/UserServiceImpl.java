package damo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import damo.mapper.UserMapper;
import damo.pojo.User;
import damo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(String name, String password) {
		return userMapper.userLogin(name, password);
	}

	@Override
	public Integer regedit(User user) {
		return userMapper.userAdd(user);

	}

	@Override
	public List<User> findAllUser() {
		return userMapper.userAll();
	}

	@Override
	public User findOneUser(String id) {
		return userMapper.userGet(id);
	}

	@Override
	public void deleOnetUser(String id) {
		userMapper.userDeleOne(id);

	}

	@Override
	public void alertOneUser(User user) {// 修改用户信息
		userMapper.userAlertOne(user);
	}

}
