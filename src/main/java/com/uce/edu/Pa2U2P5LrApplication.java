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
		
		
		System.out.println("INNER JOIN");
		
		List<Hotel> hoteClase = this.iHotelService.buscarPorClaseinnerJoin("Economica");
		for(Hotel h :hoteClase ) {
			System.out.println(h);
		}
		
		List<Hotel> hoteClase2 = this.iHotelService.buscarPorNumeroinnerJoin("A1");
		for(Hotel h :hoteClase2 ) {
			System.out.println(h);
		}
		System.out.println("LEFT JOIN");
		
		List<Hotel> hoteClase3 = this.iHotelService.buscarPorClaseLeftJoin("Presidencial");
		for(Hotel h :hoteClase3 ) {
			System.out.println(h);
		}
		List<Hotel> hoteClase4 = this.iHotelService.buscarPorNumeroLeftJoin("A1");
		for(Hotel h :hoteClase4 ) {
			System.out.println(h);
		}
		System.out.println("RIGHT JOIN");
		List<Hotel> hoteNumero = this.iHotelService.buscarPorNumeroRightJoin("A1");
		for(Hotel h :hoteNumero) {
			System.out.println(h);
		}
		List<Hotel> hoteNumero2 = this.iHotelService.buscarPorClaseRightJoin("Economica");
		for(Hotel h :hoteNumero2) {
			System.out.println(h);
		}
		System.out.println("FULL JOIN");
		List<Hotel> hoteNumero3 = this.iHotelService.buscarPorNumeroFullJoin("A2");
		for(Hotel h :hoteNumero3 ) {
			System.out.println(h);
		}
		List<Hotel> hoteNumero4 = this.iHotelService.buscarPorClaseFullJoin("Presidencial");
		for(Hotel h :hoteNumero4 ) {
			System.out.println(h);
		}
		
		System.out.println("FETCH JOIN");
		List<Hotel> hoteClase5 = this.iHotelService.buscarPorNumerofetchJoin("A2");
		for(Hotel h :hoteClase5 ) {
			System.out.println(h);
		}
		List<Hotel> hoteNumero5 = this.iHotelService.buscarPorClasefetchJoin("Presidencial");
		for(Hotel h :hoteNumero5 ) {
			System.out.println(h);
		}
		
	}

}
