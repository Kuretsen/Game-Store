package com.kodilla.gamestore.service;

import com.kodilla.gamestore.domain.Games;
import com.kodilla.gamestore.exception.GameNotFoundException;
import com.kodilla.gamestore.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameDbService {

    private final GameRepository repository;

    public Games saveGame(Games game) {
        return repository.save(game);
    }

    public void deleteGame(Long gameId) throws GameNotFoundException {
        Games game = getGame(gameId);
        repository.delete(game);
    }

    public List<Games> getAllGames() {
        return repository.findAll();
    }

    public Games getGame(Long gamesId) throws GameNotFoundException {
        return repository.findById(gamesId)
                .orElseThrow(() -> new GameNotFoundException(gamesId));
    }
}
