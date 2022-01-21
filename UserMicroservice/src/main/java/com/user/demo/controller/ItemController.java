package com.user.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.demo.model.Item;
import com.user.demo.service.ItemService;

@RestController
@CrossOrigin
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/allItems")
	public ResponseEntity<List<Item>> getItem(){
		List<Item> items = this.itemService.getAllItem();
		return new ResponseEntity<List<Item>>(items, HttpStatus.OK);
	}
}
