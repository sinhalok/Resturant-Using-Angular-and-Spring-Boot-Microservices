package com.admin.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin.demo.model.Admin;
import com.admin.demo.model.Messages;
import com.admin.demo.model.ResponsePage;
import com.admin.demo.model.User;
import com.admin.demo.repository.UserRepository;
import com.admin.demo.service.AdminService;
import com.admin.demo.service.UserService;



@RestController
@CrossOrigin
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/adminLogin")
	public ResponseEntity<?> adminLogin(@RequestBody Admin admin){
		if(this.adminService.adminLogin(admin)) {
			return ResponseEntity.ok().body(new ResponsePage(Messages.SUCCESS, "You have successfuly login!"));
		}else {
			return ResponseEntity.badRequest().body(new ResponsePage(Messages.FAILURE, "Username or password is wrong"));
		}
	}
	
	@PostMapping("/createUser")
	public ResponseEntity<?> createUser(@RequestBody User user){
		user.setAdmin(0);
		if(this.userService.createUser(user)) {
			return ResponseEntity.ok().body(new ResponsePage(Messages.SUCCESS, "You have successfuly created user!"));
		}else {
			return ResponseEntity.badRequest().body(new ResponsePage(Messages.FAILURE, "You can not create user!"));
		}
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable int id){
		if(this.userService.deleteUser(id)) {
			return ResponseEntity.ok().body(new ResponsePage(Messages.SUCCESS, "You have successfuly deleted user!"));
		}else {
			return ResponseEntity.badRequest().body(new ResponsePage(Messages.FAILURE, "You can not delete user!"));
		}
	}
	
	@PutMapping("/updateUser")
	public ResponseEntity<?> updateUser(@RequestBody User user){
		if(this.userService.updateUser(user)) {
			return ResponseEntity.ok().body(new ResponsePage(Messages.SUCCESS, "You have successfuly updated user!"));
		}else {
			return ResponseEntity.badRequest().body(new ResponsePage(Messages.FAILURE, "You can not update user!"));
		}
	}
	
	@GetMapping("/allUser")
	public ResponseEntity<List<User>> getAllUser(){
		List<User> Users = (List<User>) this.userRepository.findByAdmin(0);
		return new ResponseEntity<List<User>>(Users, HttpStatus.OK);
	}

}
