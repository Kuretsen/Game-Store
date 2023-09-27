package com.kodilla.gamestore.controller;

import com.kodilla.gamestore.domain.GenresDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/genres")
public class GenresController {

    @GetMapping
    public List<GenresDto> getOneGenreGames() {
        return new ArrayList<>();
    }
}
