package com.cqut.csi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cqut.csi.service.UserService;
import com.cqut.model.User;


@RestController
public class MainController {

	@Autowired  
    private UserService  userService;
	
	@RequestMapping(value = "/r")
	public List<User> r() {
		return userService.findAllUsers();
	}
	
	@RequestMapping(value="/a")
	public String a(){
		return "hello world!";
	}
}
