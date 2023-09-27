package com.kodilla.gamestore.repository;

import com.kodilla.gamestore.domain.Addresses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository extends CrudRepository<Addresses, Long> {

    @Override
    Addresses save(Addresses address);

    @Override
    void deleteById(Long id);

    @Override
    List<Addresses> findAll();

    @Override
    Optional<Addresses> findById(Long id);
}
