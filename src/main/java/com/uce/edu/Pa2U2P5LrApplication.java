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
	private IEmpleadoService iEmpleadoService;
	
	@Autowired
	private IHotelService iHotelService;
	
	@Autowired
	private IHabitacionService iHabitacionService;
	
	@Autowired
	private IAutorService iAutorService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5LrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Empleado empleado = this.iCiudadanoService.buscarPorCedula("1723353825");
		System.out.println(empleado);
		Ciudadano ciudadano = this.iCiudadanoService.buscarPorCedulaCiu("1723353825");
		System.out.println(ciudadano);
		Ciudadano ciudadano2 = this.iCiudadanoService.buscarPorApellido("Ramirez");
		System.out.println(ciudadano2);
		Ciudadano ciudadano3 = this.iCiudadanoService.buscarPorNombre("Leonardo");
		System.out.println(ciudadano3);
		
        List<Empleado> reporte = this.iEmpleadoService.buscarPorFechaIngreso(LocalDateTime.of(2023, 1, 7, 1, 1));
		
		for(Empleado empleados: reporte) {
			System.out.println(empleados);
		}
		
        List<Empleado> reporte2 = this.iEmpleadoService.buscarPorEmpleadoSalario(new BigDecimal (15));
		
		for(Empleado empleados: reporte2) {
			System.out.println(empleados);
		}
		
		Hotel hotel1 = this.iHotelService.buscarPorNombre("Marriet");
		System.out.println(hotel1);
		
		Hotel hotel2 = this.iHotelService.buscarPorDireccion("Av. Florida");
		System.out.println(hotel2);
		
		Habitacion hab1 = this.iHabitacionService.buscarPorNumero("A2");
		System.out.println(hab1);
		
		List<Habitacion> habitaciones = this.iHabitacionService.buscarPorClase("Economica");
		
		for(Habitacion habita: habitaciones) {
			System.out.println(habita);
		}
		
		List<Autor> autoresAutors = this.iAutorService.buscarPorNacionalidad("Ecuatoriano");
		
		for(Autor autores: autoresAutors) {
			System.out.println(autores);
		}
		
	}

}
