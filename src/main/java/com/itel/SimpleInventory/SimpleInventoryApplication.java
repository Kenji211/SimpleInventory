package com.itel.SimpleInventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class SimpleInventoryApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SimpleInventoryApplication.class, args);
		InventoryMenuService menuService = context.getBean(InventoryMenuService.class);
//		InventoryService initialProduct = context.getBean(InventoryService.class);
//		initialProduct.addItemToInventory("iPhone 14", new BigDecimal(999), 1000L, Category.ELECTRONICS);
		menuService.displayMenu();
	}
}
