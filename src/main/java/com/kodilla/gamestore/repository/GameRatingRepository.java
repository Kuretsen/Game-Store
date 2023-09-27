package com.kodilla.gamestore.repository;

import com.kodilla.gamestore.domain.GameRatings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameRatingRepository extends CrudRepository<GameRatings, Long> {

    @Override
    GameRatings save(GameRatings rating);

    @Override
    void deleteById(Long id);

    @Override
    List<GameRatings> findAll();

    @Override
    Optional<GameRatings> findById(Long id);
}
