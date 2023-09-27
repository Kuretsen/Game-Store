package com.kodilla.gamestore.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/order")
public class OrderController {

    @PostMapping
    public void addOrder() {

    }

    @GetMapping(value = "{orderId}")
    public void getOrder() {

    }

    @GetMapping
    public void getOrders() {

    }

    @PutMapping
    public void updateOrder() {

    }

    @DeleteMapping
    public void deleteOrder() {

    }
}
