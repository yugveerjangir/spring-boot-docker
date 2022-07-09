package com.yugveer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDocker1Application {

	@GetMapping("/")
	public String getMessage() {
		return "WELCOME IN YUGVEER-IT";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDocker1Application.class, args);
	}

}
