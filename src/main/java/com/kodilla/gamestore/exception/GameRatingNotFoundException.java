package com.kodilla.gamestore.exception;

public class GameRatingNotFoundException extends RuntimeException {

    public GameRatingNotFoundException (long id) {
        super(String.format("Game rating with id %s not found", id));
    }
}
