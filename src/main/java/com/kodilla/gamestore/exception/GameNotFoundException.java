package com.kodilla.gamestore.exception;

public class GameNotFoundException extends RuntimeException {

    public GameNotFoundException (long id) {
        super(String.format("Game with id %s not found", id));
    }
}
