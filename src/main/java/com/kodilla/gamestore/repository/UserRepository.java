package com.kodilla.gamestore.repository;

import com.kodilla.gamestore.domain.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {

    @Override
    Users save(Users users);

    @Override
    void deleteById(Long id);

    @Override
    List<Users> findAll();

    @Override
    Optional<Users> findById(Long id);
}
