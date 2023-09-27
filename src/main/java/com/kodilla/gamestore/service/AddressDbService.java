package com.kodilla.gamestore.service;

import com.kodilla.gamestore.domain.Addresses;
import com.kodilla.gamestore.exception.AddressNotFoundException;
import com.kodilla.gamestore.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressDbService {

    private final AddressRepository repository;

    public Addresses saveAddress(Addresses address) {
        return repository.save(address);
    }

    public void deleteAddress(Long addressId) throws AddressNotFoundException {
        Addresses address = getAddress(addressId);
        repository.delete(address);

    }

    public List<Addresses> getAllAddresses() {
        return repository.findAll();
    }

    public Addresses getAddress(Long addressId) throws AddressNotFoundException {
        return repository.findById(addressId)
                .orElseThrow(() -> new AddressNotFoundException(addressId));
    }
}
