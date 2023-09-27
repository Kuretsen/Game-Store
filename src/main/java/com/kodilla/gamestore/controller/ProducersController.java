package com.kodilla.gamestore.controller;

import com.kodilla.gamestore.domain.ProducersDto;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/producer")
public class ProducersController {

    @PostMapping
    public void createProducer(ProducersDto producersDto) {

    }

    @GetMapping
    public List<ProducersDto> getProducers()  {
        return new ArrayList<>();
    }

    @GetMapping(value = "/game/{gameId}")
    public List<ProducersDto> getAllGamesOfProducer() {
        return new ArrayList<>();
    }

    @GetMapping(value = "/genre/{genreId}")
    public List<ProducersDto> getAllGamesOfOneGenreOfProducer() {
        return new ArrayList<>();
    }

    @PutMapping
    public ProducersDto updateProducer(ProducersDto producersDto) {
        return new ProducersDto(1L, "Blizzard", "Correction", LocalDate.of(1999, 5, 9));
    }
}
