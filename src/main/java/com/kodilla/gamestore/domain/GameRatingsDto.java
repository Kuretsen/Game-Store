package com.kodilla.gamestore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GameRatingsDto {

    private Long gameRatingsId;
    private double rate;
    private String description;
    private Long userId;
    private Long gameId;
}
