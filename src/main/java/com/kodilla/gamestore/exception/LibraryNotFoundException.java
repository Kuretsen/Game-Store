package com.kodilla.gamestore.exception;

public class LibraryNotFoundException extends RuntimeException {

    public LibraryNotFoundException(long id) {
        super(String.format("Library with id %s not found", id));
    }
}
