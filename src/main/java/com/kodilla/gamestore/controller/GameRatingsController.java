package com.kodilla.gamestore.controller;

import com.kodilla.gamestore.domain.GameRatingsDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/rating")
public class GameRatingsController {

    @PostMapping
    public void createGameRating(GameRatingsDto gameRatingsDto) {

    }

    @GetMapping
    public void showAverageGameRating(GameRatingsDto gameRatingsDto) {

    }
}
