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
import org.springframework.boot.availability.AvailabilityChangeEvent;

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
import com.uce.edu.service.IAutorService;
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
	private ICiudadanoService iCiudadanoService;
	
	@Autowired
	private IHotelService iHotelService;

	@Autowired
	private IHabitacionService iHabitacionService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5LrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Critica API Query: Ciudadano cedula");
		
		Ciudadano ciudadano = this.iCiudadanoService.buscarPorCedulaCiu("1723353825");
		System.out.println(ciudadano);
		
		System.out.println("Critica API Query: Ciudadano Nombre");
		
		Ciudadano ciudadano3 = this.iCiudadanoService.buscarPorNombre("Leonardo");
		System.out.println(ciudadano3);
		
		System.out.println("Critica API Query: Hotel Nombre");
		
		Hotel hotel1 = this.iHotelService.buscarPorNombre("Marriet");
		System.out.println(hotel1);
		
		System.out.println("Critica API Query: Hotel direccion");

		Hotel hotel2 = this.iHotelService.buscarPorDireccion("Av. Florida");
		System.out.println(hotel2);
		
		System.out.println("Critica API Query: Habitacion numero");

		Habitacion hab1 = this.iHabitacionService.buscarPorNumero("A2");
		System.out.println(hab1);
	}

}
