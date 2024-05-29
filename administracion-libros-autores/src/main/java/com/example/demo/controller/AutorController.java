package com.example.demo.controller;

import com.example.demo.entity.Autor;
import com.example.demo.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public ResponseEntity<Autor> createAutor(@RequestBody Autor autor) {
        return ResponseEntity.ok(autorService.createAutor(autor));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Autor>> getAutor(@PathVariable Long id) {
        return ResponseEntity.ok(autorService.getAutor(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Autor> updateAutor(@PathVariable Long id, @RequestBody Autor autor) {
        autor.setId(id);
        return ResponseEntity.ok(autorService.updateAutor(autor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAutor(@PathVariable Long id) {
        autorService.deleteAutor(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Autor>> getAllAutores() {
        return ResponseEntity.ok(autorService.getAllAutores());
    }
}
