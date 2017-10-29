package damo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import damo.pojo.User;

public interface UserMapper {
	// 插入用户数据
	public int userAdd(User user);

	public void userDelete(User user);

	// 查找一条数据
	public User userGet(String id);

	public void userUpdate(User user);

	public User userList(User user);

	// 校验用户登录信息
	public User userLogin(@Param("name") String name, @Param("password") String password);

	// 遍历所有用户
	public List<User> userAll();

	// 删除一条记录
	public void userDeleOne(String id);

	// 更改一条数据
	public void userAlertOne(User user);// 修改用户信息
	// 遍历条件所有用户

	public List<User> userLimit(@Param("begin") String begin, @Param("end") String end);
}
