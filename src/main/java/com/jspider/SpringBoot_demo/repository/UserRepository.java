package com.jspider.SpringBoot_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspider.SpringBoot_demo.dto.User;

public interface UserRepository  extends JpaRepository<User, Integer>{
 
}
