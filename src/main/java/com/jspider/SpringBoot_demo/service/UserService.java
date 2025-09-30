package com.jspider.SpringBoot_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspider.SpringBoot_demo.dto.User;
import com.jspider.SpringBoot_demo.repository.UserDao;

@Service
public class UserService {
	@Autowired
	UserDao userdao;

	public List<User> regesterUser(@RequestBody User user) {
		return userdao.regesterUser(user);
	}
	public List<User> getAllUser() {

		return userdao.getAllUser();
	}
	public User getUserById(@RequestParam int userid) {

		return userdao.getUserById(userid);
	}
	public User updateUserById(@RequestParam int userid) {
		
		return userdao.updateUserById(userid);
	}
	public User deleteUser(@RequestParam int userid) {

		return userdao.deleteUser(userid);
	}
}
