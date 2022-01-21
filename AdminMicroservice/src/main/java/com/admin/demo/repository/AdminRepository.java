package com.admin.demo.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.admin.demo.model.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {
     public boolean existsByEmail(String email);
}
