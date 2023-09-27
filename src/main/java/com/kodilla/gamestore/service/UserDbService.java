package com.kodilla.gamestore.service;

import com.kodilla.gamestore.domain.Users;
import com.kodilla.gamestore.exception.UserNotFoundException;
import com.kodilla.gamestore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDbService {

    private final UserRepository repository;

    public Users saveUser(Users user) {
        return repository.save(user);
    }

    public void deleteUser(Long userId) throws UserNotFoundException {
        Users user = getUser(userId);
        repository.delete(user);
    }

    public List<Users> getAllUsers() {
        return repository.findAll();
    }

    public Users getUser(Long userId) throws UserNotFoundException {
        return repository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));
    }
}
