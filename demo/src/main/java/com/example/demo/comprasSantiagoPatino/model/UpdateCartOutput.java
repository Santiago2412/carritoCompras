package com.example.demo.comprasSantiagoPatino.model;

import com.example.demo.comprasSantiagoPatino.domain.Cart;

public class UpdateCartOutput {
    private Cart cart;

    public UpdateCartOutput() {
    }

    public UpdateCartOutput(Cart cart) {

        this.cart = cart;
    }

    public Cart getShoppingCart() {

        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
