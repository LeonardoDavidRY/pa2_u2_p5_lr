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
import com.uce.edu.repository.modelo.Autor2;
import com.uce.edu.repository.modelo.AutorLibro;
import com.uce.edu.repository.modelo.Ciudadano;
import com.uce.edu.repository.modelo.Empleado;
import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.repository.modelo.Habitacion;
import com.uce.edu.repository.modelo.Hotel;
import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;
import com.uce.edu.service.IAlumnoService;
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
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5LrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Libro2 libro = new Libro2();
		libro.setTitulo("Java2");
		libro.setFechaPublicacion(LocalDateTime.now());
		
		Autor2 autor1 = new Autor2();
		autor1.setNacionalidad("Ecuatoriano 2");
		autor1.setNombre("Pepito Perez 2");
		
		Autor2 autor2 = new Autor2();
		autor2.setNacionalidad("Ecuatoriano");
		autor2.setNombre("Daniel Teran");
		
		Set<Autor2> autores = new HashSet<Autor2>();
		
		autores.add(autor1);
		autores.add(autor2);
		
		AutorLibro autorLibro1 = new AutorLibro();
		autorLibro1.setLibro2(libro);
		autorLibro1.setAutor2(autor1);
		autorLibro1.setFecha(LocalDateTime.now());
		
		AutorLibro autorLibro2 = new AutorLibro();
		autorLibro2.setLibro2(libro);
		autorLibro2.setAutor2(autor2);
		autorLibro2.setFecha(LocalDateTime.now());
		
		List<AutorLibro> lista = new ArrayList<>();
		lista.add(autorLibro1);
		lista.add(autorLibro2);
		
		libro.setAutoresLibros(lista);
		
		//this.iLibroService.guardar(libro);
		
		Libro libroFinal = this.iLibroService.buscarPorNombre("Java");
		System.out.println(libroFinal);
		
	}

}
