package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Client {
	public static void main(String[] args) {
		//Starting the Application
		SpringApplication.run(Client.class, args);
		System.out.println("Application running on port 3000");

	}

}
