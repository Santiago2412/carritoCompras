package com.example.demo.comprasSantiagoPatino.repository;

import com.example.demo.comprasSantiagoPatino.domain.*;

import java.util.List;

public interface ShoppingProductRepository {

    List<ShoppingProduct> list();

    List<ShoppingProduct> listByCartId(CartId cartId);

    ShoppingProduct findOne(CartId cartId, ProductId productId);

    void create(ShoppingProduct shoppingProduct);

    void update(CartId cartId, ProductId productId, ShoppingProduct shoppingProduct);

    void delete(CartId cartId, ProductId id);
}
