package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.mode.User;
import com.example.demo.service.UserService;
@Controller
@RequestMapping(value="api/user")
public class TestController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/addUser",method = RequestMethod.POST)
	@ResponseBody
    public User addUser(
    		@ModelAttribute User user) {
		return userService.saveUser(user);
    }
	@RequestMapping(value="/findUserByUserName",method = RequestMethod.GET)
	@ResponseBody
    public List<User> getUser(
    		@RequestParam(value = "userName",required = true) String userName) {
		return userService.getUserByUserName(userName);
    }

}
