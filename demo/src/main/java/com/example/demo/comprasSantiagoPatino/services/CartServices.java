package com.example.demo.comprasSantiagoPatino.services;

import com.example.demo.comprasSantiagoPatino.domain.*;
//import com.example.demo.comprasSantiagoPatino.domain.ShoppingProduct;
import com.example.demo.comprasSantiagoPatino.repository.CartRepository;
import com.example.demo.comprasSantiagoPatino.repository.ShoppingProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServices {
    private final CartRepository repository;
    private final ShoppingProductRepository shoppingProductRepository;

    public CartServices(CartRepository repository, ShoppingProductRepository shoppingProductRepository) {
        this.repository = repository;
        this.shoppingProductRepository = shoppingProductRepository;
    }

    public List<Cart> listCart() {
        return repository.list();
    }

    public Cart createCart(Cart cart, List<ShoppingProduct> cartProducts) {
        repository.create(cart);
        for(ShoppingProduct shopProd : cartProducts){ //for each recorre cada elemento de la lista shoppingProduct
            shoppingProductRepository.create(shopProd);//llama el create tantas veces hayan elemntos en esa lista

        }
        return cart;
    }

    public Cart getCart(CartId cartId) {
        Cart cart = repository.findOne(cartId);//busca el cart por el id
        cart.setProducts(shoppingProductRepository.listByCartId(cartId));//busca los productos asociados por el carId
        return cart;
    }

    public void deleteCart(CartId cartId) {
        repository.delete(cartId);
    }


    public Cart updateCart(CartId cartId, Cart cart) {
        repository.update(cartId, cart);

        return repository.findOne(cartId);
    }
}
