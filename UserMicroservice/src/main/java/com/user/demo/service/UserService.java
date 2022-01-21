package com.user.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.demo.model.User;
import com.user.demo.model.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    public boolean insertUser(User user) {
    	if(this.userRepository.existsByEmail(user.getEmail())) {
    		return false;
    	}
    	this.userRepository.save(user);
    	return true;
   }
    
   public boolean userLogin(User user) {
	   if(this.userRepository.existsByEmail(user.getEmail())) {
		   for(User findUser : getAllUser()) {
			   if(findUser.getPassword().equals(user.getPassword()) && findUser.getAdmin() == 0) {
				   return true;
			   }
		   }
   		return false;
   	}
   	return false;
   }
   
   public List<User> getAllUser(){
	   return (List<User>) this.userRepository.findAll();
   }
    
}
