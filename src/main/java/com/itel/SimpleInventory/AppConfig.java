package com.itel.SimpleInventory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class AppConfig {

    @Bean
    public Map<String, Product> inventory(){

        Map<String, Product> productInventory = new HashMap<>();
        productInventory.put("IPhone", new Product("iPhone 14", new BigDecimal(999), 1000L, Category.ELECTRONICS));
        return productInventory;
    }
}