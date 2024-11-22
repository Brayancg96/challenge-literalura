package com.brayan.libreria.proyecto_libreria.model;

import java.util.List;

import com.brayan.libreria.proyecto_libreria.dto.LibroDto;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LibrosRespuestaApi {

     @JsonAlias("results")
    List<LibroDto> resultadoLibros;

    public List<LibroDto> getResultadoLibros() {
        return resultadoLibros;
    }

    public void setResultadoLibros(List<LibroDto> resultadoLibros) {
        this.resultadoLibros = resultadoLibros;
    }

}
