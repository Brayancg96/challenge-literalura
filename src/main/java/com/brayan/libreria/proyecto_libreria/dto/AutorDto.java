package com.brayan.libreria.proyecto_libreria.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AutorDto(
    @JsonAlias("name") String nombre,
    @JsonAlias("birth_year") Integer cumpleanios,
    @JsonAlias("death_year") Integer fechaFallecimiento
) {

}
