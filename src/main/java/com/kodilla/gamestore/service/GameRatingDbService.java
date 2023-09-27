package com.kodilla.gamestore.service;

import com.kodilla.gamestore.domain.GameRatings;
import com.kodilla.gamestore.exception.GameRatingNotFoundException;
import com.kodilla.gamestore.repository.GameRatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameRatingDbService {

    private final GameRatingRepository repository;

    public GameRatings saveRating(GameRatings rating) {
        return repository.save(rating);
    }

    public void deleteRating(Long ratingId) throws GameRatingNotFoundException {
        GameRatings gameRating = getRating(ratingId);
        repository.delete(gameRating);

    }

    public List<GameRatings> getAllRatings() {
        return repository.findAll();
    }

    public GameRatings getRating(Long ratingId) throws GameRatingNotFoundException {
        return repository.findById(ratingId)
                .orElseThrow(() -> new GameRatingNotFoundException(ratingId));
    }
}
