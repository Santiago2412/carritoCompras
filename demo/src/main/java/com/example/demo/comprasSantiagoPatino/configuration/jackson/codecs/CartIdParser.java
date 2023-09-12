package com.example.demo.comprasSantiagoPatino.configuration.jackson.codecs;

import com.example.demo.comprasSantiagoPatino.domain.CartId;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class CartIdParser {
    public static class Serializer extends JsonSerializer<CartId> {
        @Override
        public void serialize(CartId value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString(value.toString());
        }
    }

    public static class Deserializer extends JsonDeserializer<CartId> {
        @Override
        public CartId deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
            return CartId.fromString(p.getValueAsString());
        }
    }
}
