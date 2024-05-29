package com.example.demo.service;

import com.example.demo.entity.Autor;
import com.example.demo.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public Autor createAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public Optional<Autor> getAutor(Long id) {
        return autorRepository.findById(id);
    }

    public Autor updateAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public void deleteAutor(Long id) {
        autorRepository.deleteById(id);
    }

    public List<Autor> getAllAutores() {
        return autorRepository.findAll();
    }
}
