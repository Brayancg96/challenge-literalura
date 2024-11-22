package com.brayan.libreria.proyecto_libreria;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brayan.libreria.proyecto_libreria.principal.Principal;
import com.brayan.libreria.proyecto_libreria.repository.AutorRepository;
import com.brayan.libreria.proyecto_libreria.repository.LibroRepository;




@SpringBootApplication
public class ProyectoLibreriaApplication implements CommandLineRunner {

	@Autowired
	private LibroRepository libroRepository;

	@Autowired
	private AutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoLibreriaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal libreria = new Principal(libroRepository, autorRepository);
		libreria.consumo();
		

	}

}
