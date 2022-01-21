package com.admin.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.admin.demo.model.Admin;
import com.admin.demo.repository.AdminRepository;

@SpringBootApplication
@EnableEurekaClient
public class AdminMicroserviceApplication {
	@Autowired
	private AdminRepository adminRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AdminMicroserviceApplication.class, args);
		System.out.println("Admin service");
	}
//	
//	@Bean
//	public void insertAdmin() {
//		Admin admin1 = new Admin("Vishal","vishal@gmail.com","Vishal@123",1);
//		Admin admin2 = new Admin("Alok","alok@gmail.com","Alok@123",1);
//		
//		this.adminRepository.save(admin1);
//		this.adminRepository.save(admin2);
//	}

}
