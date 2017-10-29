package damo.service;

import damo.pojo.UserDetailde;

public interface UserDetaildeService {
	Integer regedit(UserDetailde userDetailde);

	void deleOnetUser(String id);

	UserDetailde findOneUserDetailde(String id);

	void alertOneUserDetailde(UserDetailde userDetailde);
}
