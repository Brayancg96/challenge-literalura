package com.brayan.libreria.proyecto_libreria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brayan.libreria.proyecto_libreria.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long>{

    boolean existsByTitulo(String titulo);

    List<Libro> findByIdioma(String idioma);

}
