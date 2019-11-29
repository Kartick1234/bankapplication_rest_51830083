package com.bankapp.web.controller;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.model.entities.User;
import com.bankapp.model.services.UserService;
@RestController
@RequestMapping(path="/home")
public class AccountController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping(path="/user")
	public ResponseEntity<List<User>> getAllUsers(){
		System.out.println("welcome!");
		return new ResponseEntity<List<User>>(HttpStatus.OK);
	}

	@RequestMapping(path="/hello")
	public String hello(){
		return "hello";
	}

	@RequestMapping(path="/admin")
	public String hello1(){
		return "you are admin";
	}

	@RequestMapping(path="/mgr")
	public String hello2(){
		return "you are mgr";
	}

	@RequestMapping(path="/clerk")
	public String hello3(){
		return "you are clerk";
	}
}
