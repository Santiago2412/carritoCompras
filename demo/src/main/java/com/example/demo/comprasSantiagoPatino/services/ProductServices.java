package com.example.demo.comprasSantiagoPatino.services;

import com.example.demo.comprasSantiagoPatino.domain.Product;
import com.example.demo.comprasSantiagoPatino.domain.ProductId;
import com.example.demo.comprasSantiagoPatino.repository.ProductRepository;

import java.util.List;

public class ProductServices {
    private ProductRepository repository;

    public ProductServices(ProductRepository repository) {
        this.repository = repository;
    }


    public List<Product> listProduct() {
        return repository.list();
    }


    public Product createProduct(Product  product) {
        repository.create(product);
        return product;
    }


    public Product getProduct(ProductId productId) {

        return repository.findOne(productId);
    }


    public void deleteProduct(ProductId productId) {
        repository.delete(productId);
    }


    public Product updateProduct(ProductId productId, Product product) {
        repository.update(productId, product);

        return repository.findOne(productId);
    }
}
