package com.kodilla.gamestore.exception;

public class GenreNotFoundException extends RuntimeException {

    public GenreNotFoundException(long id) {
        super(String.format("Genre with id %s not found", id));
    }
}
