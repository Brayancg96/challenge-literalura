package com.brayan.libreria.proyecto_libreria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brayan.libreria.proyecto_libreria.model.Autor;


public interface AutorRepository extends JpaRepository<Autor, Long>{

    @SuppressWarnings("null")
    List<Autor> findAll();

    List<Autor> findByCumpleaniosLessThanOrFechaFallecimientoGreaterThanEqual(int anioBuscado, int anioBuscado1);

}
