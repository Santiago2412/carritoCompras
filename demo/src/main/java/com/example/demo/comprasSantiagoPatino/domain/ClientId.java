package com.example.demo.comprasSantiagoPatino.domain;

import java.util.UUID;


public class ClientId {
    private final UUID value;

    //cada cliente tendría un id único
    public ClientId(UUID fromString) {
        this.value = fromString;
    }

    public static ClientId fromString(String client) {
        //invoca el metodo constructor que transforma el String en UUID
        return new ClientId(UUID.fromString(client));
    }
    public static ClientId random() {
        return new ClientId(UUID.randomUUID());
    }


    @Override
    public String toString() {
        return value.toString();
    }

}
