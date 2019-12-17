package com.techsquad.ekyc.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techsquad.ekyc.Models.User;
import com.techsquad.ekyc.Services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/show")
	public String show() {
		return "Working..";
	}
	
	@RequestMapping("/getUsers")
	public List<User> getUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

}
