package com.user.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class UserMicroserviceApplicationTests {

	
	@Test
	void contextLoads() {
		System.out.println("Hello");
	}

}
