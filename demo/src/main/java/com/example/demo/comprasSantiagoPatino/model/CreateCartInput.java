package com.example.demo.comprasSantiagoPatino.model;


import com.example.demo.comprasSantiagoPatino.domain.ClientId;
import com.example.demo.comprasSantiagoPatino.domain.ShoppingProduct;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;

@Getter
public class CreateCartInput {
    private List<ShoppingProduct> products;
    private ClientId clientId;
    private BigDecimal total;


    public CreateCartInput(ClientId clientId,  BigDecimal total) {
        this.clientId = clientId;
        this.total = total;
    }

    public void setClientId(ClientId clientId) {
        this.clientId = clientId;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void setProducts(List<ShoppingProduct> products) {
        this.products = products;
    }
}
