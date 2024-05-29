package com.example.demo.controller;

import com.example.demo.entity.Libro;
import com.example.demo.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping
    public ResponseEntity<Libro> createLibro(@RequestBody Libro libro) {
        return ResponseEntity.ok(libroService.createLibro(libro));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Libro>> getLibro(@PathVariable Long id) {
        return ResponseEntity.ok(libroService.getLibro(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Libro> updateLibro(@PathVariable Long id, @RequestBody Libro libro) {
        libro.setId(id);
        return ResponseEntity.ok(libroService.updateLibro(libro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLibro(@PathVariable Long id) {
        libroService.deleteLibro(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Libro>> getAllLibros() {
        return ResponseEntity.ok(libroService.getAllLibros());
    }
}
