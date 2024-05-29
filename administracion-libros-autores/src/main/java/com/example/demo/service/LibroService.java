package com.example.demo.service;

import com.example.demo.entity.Libro;
import com.example.demo.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public Libro createLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public Optional<Libro> getLibro(Long id) {
        return libroRepository.findById(id);
    }

    public Libro updateLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public void deleteLibro(Long id) {
        libroRepository.deleteById(id);
    }

    public List<Libro> getAllLibros() {
        return libroRepository.findAll();
    }
}
