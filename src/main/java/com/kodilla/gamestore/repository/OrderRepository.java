package com.kodilla.gamestore.repository;

import com.kodilla.gamestore.domain.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Long> {

    @Override
    Orders save(Orders order);

    @Override
    void deleteById(Long id);

    @Override
    List<Orders> findAll();

    @Override
    Optional<Orders> findById(Long id);
}
