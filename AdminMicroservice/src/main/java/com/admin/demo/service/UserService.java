package com.admin.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.demo.model.User;
import com.admin.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired 
	private UserRepository userRepository;
	
	public boolean createUser(User user) {
		if(this.userRepository.existsByEmail(user.getEmail())) {
			return false;
		}
		this.userRepository.save(user);
		return true;
	}
	
	public boolean deleteUser(int id) {
		this.userRepository.deleteById(id);
	    return true;
	}
	
	
	public boolean updateUser(User user) {
		if(this.userRepository.existsById(user.getId())) {
			this.userRepository.save(user);
			return true;
		}
		return false;
	}
}
