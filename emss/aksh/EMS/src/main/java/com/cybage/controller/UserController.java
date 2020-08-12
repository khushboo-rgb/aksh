package com.cybage.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.User;
import com.cybage.service.UserService;

@RestController
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	
    @GetMapping("/")
    		public String helloController()
    		{
    	      return ("<h1>hello Controller</h1>");
    		}
	
	@RequestMapping("/user")
	public List<User>getAllUser()  
	{
		logger.info("get all user");
		return userService.getAllUser();
	}
	
	@RequestMapping("/user/{id}")
	public Optional<User> getSingleUser(@PathVariable Long id) {
		logger.info("get single user");
		return userService.getSingleUserById(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/user")
    public void addUser(@RequestBody User employee)
    {
		
		logger.info("add all user");
		userService.addUsers(employee);
    }
	
	@RequestMapping(method=RequestMethod.DELETE,value="/user/{id}")
	public void deleteUser(@PathVariable Long id)
	{
		logger.info("delete a user user");
				
		userService.deleteUserById(id);
			
	}
	
}	
