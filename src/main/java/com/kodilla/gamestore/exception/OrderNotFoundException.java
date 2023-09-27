package com.kodilla.gamestore.exception;

public class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException(long id) {
        super(String.format("Order with id %s not found", id));
    }
}
