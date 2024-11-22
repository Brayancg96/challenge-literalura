package com.brayan.libreria.proyecto_libreria.dto;

import java.util.List;



//import com.brayan.libreria.proyecto_libreria.model.Autor;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LibroDto(
        @JsonAlias("id") Long libroId,
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<AutorDto> autor, //@JsonAlias("authors") List<Author> authors,
        @JsonAlias("languages") List<String> idioma,
        @JsonAlias("download_count") Long cantidadDescargas
) {

    
}
