package com.kodilla.gamestore.repository;

import com.kodilla.gamestore.domain.Producers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProducerRepository extends CrudRepository<Producers, Long> {

    @Override
    Producers save(Producers producer);

    @Override
    void deleteById(Long id);

    @Override
    List<Producers> findAll();

    @Override
    Optional<Producers> findById(Long id);
}
