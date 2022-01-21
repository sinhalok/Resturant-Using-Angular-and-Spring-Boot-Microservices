
package com.user.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.user.demo.model.Item;
import com.user.demo.model.repository.ItemRepository;

@SpringBootApplication
@EnableEurekaClient
public class UserMicroserviceApplication {

	@Autowired
	private ItemRepository itemRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(UserMicroserviceApplication.class, args);
		System.out.println("User Service");
	}

//	@Bean
//	public void insertData() {
//		Item item1 = new Item("Rajma Chawal", 2, 150.0);
//		Item item2 = new Item("Momos", 2, 190.0);
//		Item item3 = new Item("Red thai Curry", 2, 180.0);
//		Item item4 = new Item("Chaap", 2, 190.0);
//		Item item5 = new Item("Chilly Potato", 1, 250.0);
//		
//	    this.itemRepository.save(item1);
//	    this.itemRepository.save(item2);
//	    this.itemRepository.save(item3);
//	    this.itemRepository.save(item4);
//    this.itemRepository.save(item5);
//
//	}
	
}

