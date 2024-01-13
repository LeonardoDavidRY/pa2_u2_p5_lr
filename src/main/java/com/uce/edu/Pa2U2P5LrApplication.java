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
	
	// 1.- Query (JPQL)
	// 1.1 TypedQuery
	// 1.2 NamedQuery
	
	// 2.- Native Query
	// 3.- Criteria API Query
	
	@Autowired
	private ILibroService iLibroService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5LrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Query");
		List<Libro> lista=this.iLibroService.buscarPorFecha(LocalDateTime.of(2023, 1, 7, 1, 1));
		
		for(Libro libro :lista ) {
			System.out.println(libro);
		}
		System.out.println("TypedQuery");
		
		Libro li1 = this.iLibroService.buscarPorTilulo("JAVA AVANZADO I");
		System.out.println(li1);
		
		List<Libro> lista2= this.iLibroService.buscarPorFechaPublic(LocalDateTime.of(2023, 1, 7, 1, 1));
		for(Libro libro :lista2) {
			System.out.println(libro);
		}
		System.out.println("NamedQuery");
		
		Libro li2 = this.iLibroService.buscarPorTiluloNamed("JAVA");
		System.out.println(li2);
		
		List<Libro> lista3= this.iLibroService.buscarPorFechaPublicNamed(LocalDateTime.of(2023, 1, 7, 1, 1));
		for(Libro libro :lista3) {
			System.out.println(libro);
		}
	}

}
