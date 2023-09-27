package com.kodilla.gamestore.repository;

import com.kodilla.gamestore.domain.Library;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LibraryRepository extends CrudRepository<Library, Long> {

    @Override
    Library save(Library library);

    @Override
    void deleteById(Long id);

    @Override
    List<Library> findAll();

    @Override
    Optional<Library> findById(Long id);
}
