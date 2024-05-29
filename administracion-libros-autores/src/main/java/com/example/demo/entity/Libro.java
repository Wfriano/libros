package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private int añoPublicacion;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    // Getters y Setters
}
