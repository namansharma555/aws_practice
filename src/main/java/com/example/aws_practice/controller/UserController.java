package com.example.aws_practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.User;
import com.example.respository.IUserRepository;

@RestController
@RequestMapping("/practice/api/user")
public class UserController {
	
	@Autowired
	IUserRepository userRepository;

	@RequestMapping(value = "/{contactNumber}", method = RequestMethod.GET)
	public ResponseEntity<User> getUserByNumber(@PathVariable("contactNumber") String contactNumber){
		System.out.println("contact number is "+contactNumber);
		User user = userRepository.getUserByNumber(contactNumber);
		System.out.println("user is "+user);
		return  ResponseEntity.ok(user);
	}

}
