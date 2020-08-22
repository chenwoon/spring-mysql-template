package com.chenwoon.template;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApp implements CommandLineRunner {

	public void run(String... args) throws Exception {
		System.out.println("Hello MySQL Project!");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringApp.class, args);
	}

}
