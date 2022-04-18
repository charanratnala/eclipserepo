package com.lhs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserserviceApplication {
	@Autowired
	PlayGround ground;
	
	//ground.

	public static void main(String[] args) {
		
		SpringApplication.run(UserserviceApplication.class, args);
	}

}
