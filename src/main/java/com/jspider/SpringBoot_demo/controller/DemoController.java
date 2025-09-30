package com.jspider.SpringBoot_demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.SpringBoot_demo.dto.User;
import com.jspider.SpringBoot_demo.service.UserService;

@RestController
@RequestMapping("/demo")
public class DemoController {
//	@RequestMapping(name="getMethod",method =RequestMethod.GET)
	@Autowired
	UserService userservice;

	@GetMapping("/getMessage")
	public String getMessage() {

		return "WELCOME TO MY -DEMO- APP";

	}

	@GetMapping("/getuser")
	public User getUser() {
		User user = new User();
		user.setName("yovel");
		user.setEmail("helloyovel@gmail.com");
		user.setContact("1234556098");
		user.setAddress("chennai");
		return user;
	}

	@PostMapping("/regester")
	public List<User> regesterUser(@RequestBody User user) {

		
		return userservice.regesterUser(user);
	}

	@GetMapping("/getAllUser")
	public List<User> getAllUser() {

		return userservice.getAllUser();
	}

	@GetMapping("/getUserId")
	// localhost:8080/demo/getUserId?userid=1
	public User getUserById(@RequestParam int userid) {

		return userservice.getUserById(userid);
	}

	@PutMapping("/updateUserId")
//	localhost:8080/demo/updateUserId?userid=1
	public User updateUserById(@RequestParam int userid) {
		
		return userservice.updateUserById(userid);
	}

	@DeleteMapping("/deleteUserId")
	public User deleteUser(@RequestParam int userid) {

		return userservice.deleteUser(userid);
	}

}
