package com.kodilla.gamestore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/library")
public class LibraryController {

    @PostMapping
    public void addNewGameToLibrary() {

    }

    @GetMapping
    public void showUserGames() {

    }

}
