package com.kodilla.gamestore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class OrdersDto {

    private long orderId;
    private String name;
    private LocalDate created;
    private BigDecimal cost;
    private long gameId;
    private long userId;
}
