package damo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import damo.pojo.User;

public interface PagingMapper {
	public List<User> pagingUserDefault(int id);

	public List<User> pagingUserLimit(@Param("begin") String begin, @Param("end") String end);

	public int pagingUserCount();
}
