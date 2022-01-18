package com.jwtdemo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jwtdemo.entity.user;
import com.jwtdemo.repository.UserRepo;

@SpringBootApplication
public class JwtdemoApplication {
	@Autowired
	private UserRepo ur;
	@PostConstruct
	public void initUsers() {
		List<user> users =  Stream.of(
                new user(101, "javatechie", "password", "javatechie@gmail.com"),
                new user(102, "user1", "pwd1", "user1@gmail.com"),
                new user(103, "user2", "pwd2", "user2@gmail.com"),
                new user(104, "user3", "pwd3", "user3@gmail.com")
        ).collect(Collectors.toList());
		ur.saveAll(users);
	}
	public static void main(String[] args) {
		SpringApplication.run(JwtdemoApplication.class, args);
	}

}
