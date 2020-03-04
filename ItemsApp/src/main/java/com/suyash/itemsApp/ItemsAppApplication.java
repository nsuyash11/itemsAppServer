package com.suyash.itemsApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemsAppApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ItemsAppApplication.class);
		app.run(args);
	}

}
