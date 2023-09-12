package com.example.demo.comprasSantiagoPatino.repository;

import com.example.demo.comprasSantiagoPatino.domain.Product;
import com.example.demo.comprasSantiagoPatino.domain.ProductId;

import java.util.List;

public interface ProductRepository {

    List<Product> list();

    Product findOne(ProductId id);

    void create(Product product);

    void update(ProductId id, Product product);

    void delete(ProductId id);
}
