package com.kodilla.gamestore.controller;

import com.kodilla.gamestore.domain.UsersDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @PostMapping
    public void createUser(UsersDto usersDto) {

    }

    @DeleteMapping
    public void deleteUser(UsersDto usersDto) {

    }

    @PutMapping
    public void renameUserName() {

    }

    @PutMapping(value = "/block/{userId}")
    public void blockUser() {

    }
}
