package com.kodilla.gamestore.service;

import com.kodilla.gamestore.domain.Genres;
import com.kodilla.gamestore.exception.GenreNotFoundException;
import com.kodilla.gamestore.repository.GenresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenresDbService {

    private final GenresRepository repository;

    public Genres saveGenre(Genres genre) {
        return repository.save(genre);
    }

    public void deleteGenre(Long genreId) throws GenreNotFoundException {
        Genres genre = getGenre(genreId);
        repository.delete(genre);
    }

    public List<Genres> getAllGenres() {
        return repository.findAll();
    }

    public Genres getGenre(Long genreId) throws GenreNotFoundException {
        return repository.findById(genreId)
                .orElseThrow(() -> new GenreNotFoundException(genreId));
    }
}
