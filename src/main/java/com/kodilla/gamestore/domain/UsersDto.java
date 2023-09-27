package com.kodilla.gamestore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class UsersDto {

    private Long userId;
    private String firstName;
    private String lastName;
    private Long addressId;
    private boolean isActive;
}
