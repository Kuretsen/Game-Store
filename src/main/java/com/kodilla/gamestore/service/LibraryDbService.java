package com.kodilla.gamestore.service;


import com.kodilla.gamestore.domain.Library;
import com.kodilla.gamestore.exception.LibraryNotFoundException;
import com.kodilla.gamestore.repository.LibraryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LibraryDbService {

    private final LibraryRepository repository;

    public Library saveLibrary(Library library) {
        return repository.save(library);
    }

    public void deleteLibrary(Long libraryId) throws LibraryNotFoundException {
        Library library = getLibrary(libraryId);
        repository.delete(library);
    }

    public List<Library> getAllLibrary() {
        return repository.findAll();
    }

    public Library getLibrary(Long libraryId) throws LibraryNotFoundException {
        return repository.findById(libraryId)
                .orElseThrow(() -> new LibraryNotFoundException(libraryId));
    }
}
