package com.kodilla.gamestore.repository;

import com.kodilla.gamestore.domain.Games;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameRepository extends CrudRepository<Games, Long> {

    @Override
    Games save(Games game);

    @Override
    void deleteById(Long id);

    @Override
    List<Games> findAll();

    @Override
    Optional<Games> findById(Long id);
}
