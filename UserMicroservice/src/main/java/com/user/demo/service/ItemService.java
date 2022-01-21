package com.user.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.demo.model.Item;
import com.user.demo.model.repository.ItemRepository;

@Service
public class ItemService {
  @Autowired 
  private ItemRepository itemRepository;
  
  public List<Item> getAllItem(){
	  return (List<Item>) this.itemRepository.findAll();
  }
}
