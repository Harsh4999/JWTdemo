package com.jwtdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwtdemo.entity.user;
@Repository
public interface UserRepo extends JpaRepository<user, Integer>{
	user findByUserName(String username);
}
