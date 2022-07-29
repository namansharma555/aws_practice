package com.example.aws_practice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;



@RestController()
@RequestMapping("/practice/api/")
@Slf4j
public class PracticeController {
	
	//private static final Logger logger = LoggerFactory.getLogger(PracticeController.class);
	
	
	@RequestMapping("health")
	public ResponseEntity<String> getHealthStatus(){
		log.info("Health API is hit!!!");
		return new ResponseEntity<String>("health is up!!", HttpStatus.OK);
		}
	
	@RequestMapping("hello")  
	public String hello()   
	{  
	return "Hello world";  
	}  

}
