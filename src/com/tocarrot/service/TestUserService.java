package com.tocarrot.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tocarrot.service.UserService;
import com.tocarrot.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class TestUserService {

	@Autowired
	private UserService userService;
	
	@Test
	public void hasMatchUser()
	{
		boolean b1 = userService.hasMatchUser("admin", "123456");
		boolean b2 = userService.hasMatchUser("admin", "1111");
		
		assertTrue( b1 );
		assertTrue( !b2);
	}
	
	@Test
	public void findUserByUserName()
	{
		com.tocarrot.domain.User user = userService.findUserByUserName("admin");
		assertEquals(user.getUserName(), "admin");
	}
	
}
