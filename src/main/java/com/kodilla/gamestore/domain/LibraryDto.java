package com.kodilla.gamestore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LibraryDto {

    private long libraryId;
    private String name;
    private long userId;
    private long gameId;
}
