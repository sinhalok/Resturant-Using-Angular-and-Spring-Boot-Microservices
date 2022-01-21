package com.user.demo.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.user.demo.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer>{
  
}
