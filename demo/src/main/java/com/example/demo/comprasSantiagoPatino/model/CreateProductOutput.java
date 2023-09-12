package com.example.demo.comprasSantiagoPatino.model;

import com.example.demo.comprasSantiagoPatino.domain.Product;

public class CreateProductOutput {
    private Product product;

    public CreateProductOutput() {
    }

    public CreateProductOutput(Product product) {

        this.product = product;
    }

    public Product getProduct() {

        return product;
    }

    public void setProduct(Product product) {

        this.product = product;
    }
}
