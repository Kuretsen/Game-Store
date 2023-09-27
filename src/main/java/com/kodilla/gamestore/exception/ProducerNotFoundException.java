package com.kodilla.gamestore.exception;

public class ProducerNotFoundException extends RuntimeException {

    public ProducerNotFoundException(long id) {
        super(String.format("Producer with id %s not found", id));
    }
}
