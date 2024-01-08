package com.uce.edu;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Alumno;
import com.uce.edu.repository.modelo.Autor;
import com.uce.edu.repository.modelo.Ciudadano;
import com.uce.edu.repository.modelo.Empleado;
import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.repository.modelo.Habitacion;
import com.uce.edu.repository.modelo.Hotel;
import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.service.IAlumnoService;
import com.uce.edu.service.IAutorService;
import com.uce.edu.service.ICiudadanoService;
import com.uce.edu.service.IEmpleadoService;
import com.uce.edu.service.IEstudianteService;
import com.uce.edu.service.IHabitacionService;
import com.uce.edu.service.IHotelService;
import com.uce.edu.service.ILibroService;

@SpringBootApplication
public class Pa2U2P5LrApplication implements CommandLineRunner{
	
	@Autowired
	private ILibroService iLibroService;
	
	@Autowired
	private IAutorService iAutorService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5LrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		// Un libro con varios autores
		Libro libro = new Libro();
		libro.setTitulo("Java");
		libro.setFechaPublicacion(LocalDateTime.now());
		
		Autor autor1 = new Autor();
		autor1.setNacionalidad("Ecuatoriano");
		autor1.setNombre("Pepito Perez");
		
		Autor autor2 = new Autor();
		autor2.setNacionalidad("Ecuatoriano");
		autor2.setNombre("Daniel Teran");
		
		Set<Autor> autores = new HashSet<Autor>();
		
		autores.add(autor1);
		autores.add(autor2);
		
		libro.setAutores(autores);
		
		Set<Libro> libros = new HashSet<Libro>();
		
		libros.add(libro);		
		
		autor1.setLibros(libros);
		autor2.setLibros(libros);
		
		this.iLibroService.guardar(libro);
		
		*/
		
		// Un libro Con un Autor
				Libro libro1 = new Libro();
				libro1.setTitulo("JAVA");
				libro1.setFechaPublicacion(LocalDateTime.now());
				
				Autor au1 = new Autor();
				au1.setNombre("Pedro Perez ");
				au1.setNacionalidad("Ecuatoriano");
				
				Set<Autor> autores1 = new HashSet<Autor>();
				autores1.add(au1);

				libro1.setAutores(autores1);

				this.iLibroService.guardar(libro1);

				// Un Autors con un Libro
				Autor au2 = new Autor();
				au2.setNombre("Daniel Teran");
				au2.setNacionalidad("Ecuatoriano");

				Autor au3 = new Autor();

				au3.setNombre("Juan Palomino");
				au3.setNacionalidad("Peru");

				Libro libro2 = new Libro();
				libro2.setTitulo("JAVA AVANZADO I");
				libro2.setFechaPublicacion(LocalDateTime.now());

				Set<Libro> Libros1 = new HashSet<Libro>();
				Libros1.add(libro2);

				au2.setLibros(Libros1);
				au3.setLibros(Libros1);

				this.iAutorService.guardar(au2);
				
				// Un Autors con un Libro


				Libro libro3 = new Libro();
				libro3.setTitulo("JAVA AVANZADO II");
				libro3.setFechaPublicacion(LocalDateTime.now());

				Set<Libro> Libros2 = new HashSet<Libro>();
				Libros1.add(libro3);

				Autor au4 = new Autor();

				au4.setNombre("Juan Palomino");
				au4.setNacionalidad("Peru");
				au4.setLibros(Libros2);

				this.iAutorService.guardar(au4);
				
				Autor au5 = new Autor();
				au5.setNombre("Daniel Teran");
				au5.setNacionalidad("Ecuatoriano");
				au5.setLibros(Libros2);
				
				this.iAutorService.guardar(au5);
				
				libro3.setTitulo("JAVA AVANZADO II Segunda Edicion ");
				this.iLibroService.actualizar(libro3);

		
	}

}
