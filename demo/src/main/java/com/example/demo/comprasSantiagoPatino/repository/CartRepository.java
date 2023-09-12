package com.example.demo.comprasSantiagoPatino.repository;

import com.example.demo.comprasSantiagoPatino.domain.Cart;
import com.example.demo.comprasSantiagoPatino.domain.CartId;

import java.util.List;

public interface CartRepository {

    List<Cart> list();

    Cart findOne(CartId id);

    void create(Cart shoppingCart);

    void update(CartId id, Cart shoppingCart);

    void delete(CartId id);
}
