package damo.test.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import damo.mapper.PagingMapper;
import damo.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext*.xml" })

public class pagingMapperTest {
	@Autowired
	private PagingMapper pagingMapper;

	@Test
	public void testPagingUserLimit() {
		List<User> pLimit = pagingMapper.pagingUserLimit("0", "10");
		for (User p : pLimit) {
			System.out.println(p);
		}
	}

	@Test
	public void testPagingUserCount() {
		System.out.println(pagingMapper.pagingUserCount());
	}

	@Test
	public void testPagingUserDefault() {
		List<User> pLimit = pagingMapper.pagingUserDefault(10);
		for (User p : pLimit) {
			System.out.println(p);
		}
	}

}
