package com.jspider.SpringBoot_demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspider.SpringBoot_demo.dto.User;

@Repository
public class UserDao {
	List<User> list = new ArrayList<>();

	public List<User> regesterUser(@RequestBody User user) {

		list.add(user);
		return list;
	}
	public List<User> getAllUser() {

		return list;
	}
	
	public User getUserById(@RequestParam int userid) {

		for (User user : list) {
			if (user.getUserid() == userid) {
				return user;
			}
		}
		return null;
	}
	public User updateUserById(@RequestParam int userid) {
		for (User user2 : list) {
			if (user2.getUserid() == userid) {
				return user2;
			}

		}
		return null;
	}
	public User deleteUser(@RequestParam int userid) {
		for (User user : list) {
			if(user.getUserid()==userid) {
				return user;
			}
		}

		return null;
	}

}
