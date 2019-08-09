package com.demo.registration.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.registration.entity.User;
import com.demo.registration.service.RegistrationService;

@RestController
@RequestMapping("/registration")
public class RegistrationController {
	
	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);
	
	@Autowired
	RegistrationService registrationService;

	@PostMapping("/register")
	public ResponseEntity<User> register(@RequestBody User user) {
		logger.info("Inside Register method()#########");
		User user1 = registrationService.registerUser(user);
		return new ResponseEntity<User>(user1, HttpStatus.OK);
	}	
}
