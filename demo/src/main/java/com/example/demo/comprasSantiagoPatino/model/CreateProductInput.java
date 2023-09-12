package com.example.demo.comprasSantiagoPatino.model;

import com.example.demo.comprasSantiagoPatino.domain.ProductPrice;

public class CreateProductInput {
    private String name;
    private String description;
    private ProductPrice price;

    public CreateProductInput() {
    }

    public CreateProductInput(String name, String description, ProductPrice price) {

        this.name = name;
        this.description = description;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductPrice getPrice() {
        return price;
    }

    public void setPrice(ProductPrice price) {
        this.price = price;
    }
}
