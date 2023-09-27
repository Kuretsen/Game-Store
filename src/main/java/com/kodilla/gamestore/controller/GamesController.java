package com.kodilla.gamestore.controller;

import com.kodilla.gamestore.domain.GamesDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/games")
public class GamesController {

    @PostMapping
    public void addGame() {

    }

    @DeleteMapping
    public void deleteGame() {

    }

    @PutMapping
    public void updateGamePrice() {

    }

    @GetMapping
    public void getGames() {

    }

    @GetMapping(value = "{gameId}")
    public void getGame() {

    }
}
