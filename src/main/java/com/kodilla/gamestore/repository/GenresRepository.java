package com.kodilla.gamestore.repository;

import com.kodilla.gamestore.domain.Genres;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GenresRepository extends CrudRepository<Genres, Long> {

    @Override
    Genres save(Genres genres);

    @Override
    void deleteById(Long id);

    @Override
    List<Genres> findAll();

    @Override
    Optional<Genres> findById(Long id);
}
