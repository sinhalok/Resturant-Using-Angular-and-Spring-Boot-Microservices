package com.admin.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.demo.model.Admin;
import com.admin.demo.repository.AdminRepository;

@Service
public class AdminService {
      @Autowired 
      private AdminRepository adminRepository;
      
      public boolean adminLogin(Admin admin) {
    	  if(this.adminRepository.existsByEmail(admin.getEmail())) {
    		  for(Admin u:getAllUsers()) {
    			  if(u.getEmail().equals(admin.getEmail()) && u.getPassword().equals(admin.getPassword()) && u.getAdmin() == 1) {
    				  return true;
    			  }
    		  }
    	  }
    	  return false;
      }
      
      
      public List<Admin> getAllUsers(){
    	  return (List<Admin>) this.adminRepository.findAll();
      }
}
