package damo.test.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import damo.pojo.PunchClockBean;
import damo.service.PunchClockSerive;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext*.xml" })
public class PunchClockSeriveTest {
	@Autowired
	private PunchClockSerive punchClockSerive;

	@Test
	public void testBeginPunchClock() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindOnePunchClock() {
		PunchClockBean pC = (PunchClockBean) punchClockSerive.findOnePunchClock("a0e3e687e8f30698b7c369ad8bb11e71");
		System.out.println(pC);
	}

	@Test
	public void testEndPunchClock() {
		fail("Not yet implemented");
	}

	@Test
	public void testAnythingDatePunchClock() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindBusinessDatePunchClock() {
		fail("Not yet implemented");
	}

	@Test
	public void testComputerTime() {
		fail("Not yet implemented");
	}

}
