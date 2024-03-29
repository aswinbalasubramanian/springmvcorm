package com.aswin.spring.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aswin.spring.springmvcorm.user.entity.User;
import com.aswin.spring.springmvcorm.user.services.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}
	
	@RequestMapping("registrationPage")
	public String showRegistrationPage()
	{
		return "userReg";
	}
	
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model)
	{	
		int result = service.save(user);
		model.addAttribute("result","User Created with Id"+result);
		
		return "userReg";
	}
	
	@RequestMapping("getUsers")
	public String getUser(ModelMap model)
	{
		List<User> users = service.getUsers();
		model.addAttribute("users", users);
		return "displayUsers";
	}
}
