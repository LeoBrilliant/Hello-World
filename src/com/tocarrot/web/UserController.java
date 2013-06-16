package com.tocarrot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import com.tocarrot.domain.User;
import com.tocarrot.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/register")
	public String register()
	{
		return "/register";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String test( User user )
	{
		return "createSuccess";
	}

	/*
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView createUser(User user)
	{
		userService.createUser( user );
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/createSuccess");
		mav.addObject("User", user);
		return mav;
	}
	**/
/*	
	@RequestMapping(value="/user/createUser")
	public String createUser(@ModelAttribute("user") User user)
	{
		return "user/createSuccess";
	}
*/
}
