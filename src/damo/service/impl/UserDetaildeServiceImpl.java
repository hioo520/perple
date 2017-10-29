package damo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import damo.mapper.UserDetaildeMapper;
import damo.pojo.UserDetailde;
import damo.service.UserDetaildeService;

@Service
public class UserDetaildeServiceImpl implements UserDetaildeService {
	@Autowired
	private UserDetaildeMapper UserDetaildeMapper;

	@Override
	public Integer regedit(UserDetailde userDetailde) {
		return UserDetaildeMapper.addUserDetailde(userDetailde);
	}

	@Override
	public void deleOnetUser(String id) {
		UserDetaildeMapper.delOneUserDetailde(id);

	}

	@Override
	public UserDetailde findOneUserDetailde(String id) {
		return UserDetaildeMapper.findOneUserDetailde(id);
	}

	@Override
	public void alertOneUserDetailde(UserDetailde userDetailde) {// 更改一条数据
		UserDetaildeMapper.alertOneUserDetailde(userDetailde);
	}
}
