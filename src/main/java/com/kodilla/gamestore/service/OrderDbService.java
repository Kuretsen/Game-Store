package com.kodilla.gamestore.service;

import com.kodilla.gamestore.domain.Library;
import com.kodilla.gamestore.domain.Orders;
import com.kodilla.gamestore.exception.LibraryNotFoundException;
import com.kodilla.gamestore.exception.OrderNotFoundException;
import com.kodilla.gamestore.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderDbService {

    private final OrderRepository repository;

    public Orders saveOrder(Orders order) {
        return repository.save(order);
    }

    public void deleteOrder(Long orderId) throws OrderNotFoundException {
        Orders order = getOrder(orderId);
        repository.delete(order);
    }

    public List<Orders> getAllOrders() {
        return repository.findAll();
    }

    public Orders getOrder(Long orderId) throws OrderNotFoundException {
        return repository.findById(orderId)
                .orElseThrow(() -> new LibraryNotFoundException(orderId));
    }
}
