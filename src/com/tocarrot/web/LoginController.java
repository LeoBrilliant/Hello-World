package com.tocarrot.web;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tocarrot.domain.User;
import com.tocarrot.service.NewsManager;
import com.tocarrot.service.UserService;
import com.tocarrot.web.LoginCommand;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/index.html")
	public String loginPage()
	{
		return "login";
	}
/*	
	@RequestMapping(value = "/loginCheck.html" )
	public ModelAndView loginCheck( HttpServletRequest request, LoginCommand loginCommand )
	{
		boolean isValidUser = userService.hasMatchUser(loginCommand.getUserName(),
				loginCommand.getPassword());
		
		if( !isValidUser )
		{
			return new ModelAndView("login", "error", "用户名或密码错误");
		} else 
		{
			User user = userService.findUserByUserName(loginCommand.getUserName());
			user.setLastIp(request.getRemoteAddr());
			user.setLastVisit(new Date());
			userService.loginSuccess(user);
			request.getSession().setAttribute("user", user);
			
			return new ModelAndView("ToCarrot");
		}
	}
*/
	@RequestMapping(value = "/loginCheck.html" )
	public String loginCheck( HttpServletRequest request, LoginCommand loginCommand )
	{
		boolean isValidUser = userService.hasMatchUser(loginCommand.getUserName(),
				loginCommand.getPassword());
		
		if( !isValidUser )
		{
			//return new ModelAndView("login", "error", "用户名或密码错误");
			return "login";
		} else 
		{
			User user = userService.findUserByUserName(loginCommand.getUserName());
			user.setLastIp(request.getRemoteAddr());
			user.setLastVisit(new Date());
			userService.loginSuccess(user);
			request.getSession().setAttribute("user", user);
			
			return "forward:MsCarrot.html";
		}
	}
	@RequestMapping(value="/MsCarrot")
	public String MsCarrot(HttpServletRequest request)
	{
		List news = new NewsManager().EntityQuery();
		
		request.getSession().setAttribute("news", news);
		return "user123";
	}	
}
