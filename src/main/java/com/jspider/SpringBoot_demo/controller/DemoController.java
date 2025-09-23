package com.jspider.SpringBoot_demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.SpringBoot_demo.dto.User;

@RestController
@RequestMapping("/demo")
public class DemoController {
//	@RequestMapping(name="getMethod",method =RequestMethod.GET)
	List<User> list=new ArrayList<>();
	
	@GetMapping("/getMessage")
	public String  getMessage() {
		
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
		
		list.add(user);
		return list;
	}
	
	@GetMapping("/getAllUser")
	public List<User> getAllUser() {
		
		return list;
	}
	@GetMapping("/getUserId")
	//localhost:8080/demo/regester
	public User getUserById(@RequestParam int  userid)  {
		
		for (User user : list) {
			if(user.getUserid()==userid) {
				return user;
			}
		}
		return null;
	}
	
}
