package com.admin.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.admin.demo.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
   public boolean existsByEmail(String email);
   
   public List<User> findByAdmin(int admin);
}
