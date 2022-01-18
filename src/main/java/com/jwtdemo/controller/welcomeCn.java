package com.jwtdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwtdemo.entity.AuthReq;
import com.jwtdemo.util.JwtUtil;

@RestController
public class welcomeCn {
	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private AuthenticationManager authenticationManager;
	@GetMapping("/")
	public String welcome(){
		return "helllomm";
	}
	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthReq r)throws Exception{
		
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(r.getUserName(), r.getPassword()));authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(r.getUserName(), r.getPassword()));
		}catch(	Exception e) {
			throw new Exception("invald username or pass");
		}
		return jwtUtil.generateToken(r.getUserName());
	}
}
