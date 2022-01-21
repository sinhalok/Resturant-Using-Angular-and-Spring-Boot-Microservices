package com.user.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.demo.model.Messages;
import com.user.demo.model.ResponsePage;
import com.user.demo.model.User;
import com.user.demo.model.repository.UserRepository;
import com.user.demo.service.UserService;

@RestController
@CrossOrigin
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	 
	@PostMapping("/insertUser")
	public ResponseEntity<?> insertUser(@RequestBody User user){
		user.setAdmin(0);
		if(this.userService.insertUser(user)) {
			return ResponseEntity.ok().body(new ResponsePage(Messages.SUCCESS, "You have successfuly registered!"));
		}else {
			return ResponseEntity.badRequest().body(new ResponsePage(Messages.FAILURE, "You have already registered!"));
		}
	}
	
	
	@PostMapping("/userLogin")
	public ResponseEntity<?>  userLogin(@RequestBody User user){
		if(this.userService.userLogin(user)) {
			return ResponseEntity.ok().body(new ResponsePage(Messages.SUCCESS, "You have successfuly login!"));
		}else {
			return ResponseEntity.badRequest().body(new ResponsePage(Messages.FAILURE, "Username or password is wrong!"));
		}
	}
	

	
	@GetMapping("/findUserByEmail/{email}")
	public ResponseEntity<User> getUserByEmail(@PathVariable String email){
		User u = this.userRepository.findByEmail(email);
		return new ResponseEntity<User>(u, HttpStatus.OK);
	}
}
