package com.user.demo.model.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.user.demo.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
   public boolean existsByEmail(String email);
   public User findByEmail(String email);
}
