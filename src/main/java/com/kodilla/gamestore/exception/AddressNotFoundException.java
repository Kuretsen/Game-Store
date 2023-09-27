package com.kodilla.gamestore.exception;

public class AddressNotFoundException extends RuntimeException {

    public AddressNotFoundException (long id) {
        super(String.format("Address with id %s not found", id));
    }
}
