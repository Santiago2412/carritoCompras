package com.example.demo.comprasSantiagoPatino.configuration.jackson;

import com.example.demo.comprasSantiagoPatino.configuration.jackson.codecs.CartIdParser;
import com.example.demo.comprasSantiagoPatino.configuration.jackson.codecs.ClientIdParser;
import com.example.demo.comprasSantiagoPatino.configuration.jackson.codecs.ProductIdParser;
import com.example.demo.comprasSantiagoPatino.configuration.jackson.codecs.ProductPriceCodecs;
import com.example.demo.comprasSantiagoPatino.domain.CartId;
import com.example.demo.comprasSantiagoPatino.domain.ClientId;
import com.example.demo.comprasSantiagoPatino.domain.ProductId;
import com.example.demo.comprasSantiagoPatino.domain.ProductPrice;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class InternalModule extends SimpleModule {
    private static final String NAME = "InternalModule";

public InternalModule(){
    super(NAME, Version.unknownVersion());

    addSerializer(CartId.class, new CartIdParser.Serializer());
    addDeserializer(CartId.class, new CartIdParser.Deserializer());

    addSerializer(ClientId.class, new ClientIdParser.Serializer());
    addDeserializer(ClientId.class, new ClientIdParser.Deserializer());

    addSerializer(ProductId.class, new ProductIdParser.Serializer());
    addDeserializer(ProductId.class, new ProductIdParser.Deserializer());

    addSerializer(ProductPrice.class, new ProductPriceCodecs.Serializer());
    addDeserializer(ProductPrice.class, new ProductPriceCodecs.Deserializer());
}
}
