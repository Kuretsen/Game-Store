package com.kodilla.gamestore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GamesDto {

    private long gameId;
    private String name;
    private Double price;
    private long genresId;
    private long producerId;
}
