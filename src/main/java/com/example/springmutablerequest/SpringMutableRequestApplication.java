package com.example.springmutablerequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringMutableRequestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMutableRequestApplication.class, args);
	}

}
