package com.skilldistillery.cardbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.skilldistillery.cardbase")
public class CardBaseAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardBaseAppApplication.class, args);
	}

}
