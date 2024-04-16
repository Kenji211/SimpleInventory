package com.itel.SimpleInventory;

import java.math.BigDecimal;

public class Product {

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category=" + category +
                ", status=" + status +
                '}';
    }

    private Status displayStatus(){
        if (quantity>= 1) {
            status = Status.valueOf("Available");
        }else{
            status = Status.valueOf("Unavailable");
        }
        return status;
    }
    private String name;
    private BigDecimal price;
    private Long quantity;
    private Category category;
    private Status status;

    public Product(String name, BigDecimal price, Long quantity, Category category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.status = displayStatus();
    }

}