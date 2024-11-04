package com.awslearning.awslearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwslearningApplication {
	
	@GetMapping("/deployStatus")
	public String deploy() {
		
		return "Deploy elastic beanstalk";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwslearningApplication.class, args);
	}

}