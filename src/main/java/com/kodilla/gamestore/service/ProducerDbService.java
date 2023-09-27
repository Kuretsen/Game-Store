package com.kodilla.gamestore.service;

import com.kodilla.gamestore.domain.Producers;
import com.kodilla.gamestore.exception.ProducerNotFoundException;
import com.kodilla.gamestore.repository.ProducerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProducerDbService {
    private final ProducerRepository repository;

    public Producers saveProducer(Producers producer) {
        return repository.save(producer);
    }

    public void deleteProducer(Long producerId) throws ProducerNotFoundException {
        Producers producer = getProducer(producerId);
        repository.delete(producer);
    }

    public List<Producers> getAllProducers() {
        return repository.findAll();
    }

    public Producers getProducer(Long producerId) throws ProducerNotFoundException {
        return repository.findById(producerId)
                .orElseThrow(() -> new ProducerNotFoundException(producerId));
    }
}
