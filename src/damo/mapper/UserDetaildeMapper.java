package damo.mapper;

import damo.pojo.UserDetailde;

public interface UserDetaildeMapper {

	public int addUserDetailde(UserDetailde userDetailde);

	public UserDetailde getUserDetailde(int id);

	public void delOneUserDetailde(String id);

	public UserDetailde findOneUserDetailde(String id);// 根据user_code 查找用户信息

	public void alertOneUserDetailde(UserDetailde userDetailde);// 更改一条数据

}
