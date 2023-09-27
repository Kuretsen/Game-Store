package com.kodilla.gamestore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class ProducersDto {

    private Long producerId;
    private String name;
    private String description;
    private LocalDate dateOfCreation;
}
