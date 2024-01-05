package com.uce.edu;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Alumno;
import com.uce.edu.repository.modelo.Ciudadano;
import com.uce.edu.repository.modelo.Empleado;
import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.repository.modelo.Habitacion;
import com.uce.edu.repository.modelo.Hotel;
import com.uce.edu.service.IAlumnoService;
import com.uce.edu.service.ICiudadanoService;
import com.uce.edu.service.IEmpleadoService;
import com.uce.edu.service.IEstudianteService;
import com.uce.edu.service.IHabitacionService;
import com.uce.edu.service.IHotelService;

@SpringBootApplication
public class Pa2U2P5LrApplication implements CommandLineRunner{
	@Autowired
	private ICiudadanoService iCiudadanoService;
	
	@Autowired
	private IEmpleadoService iEmpleadoService;
	
	@Autowired
	private IHotelService iHotelService;
	
	@Autowired
	private IHabitacionService iHabitacionService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5LrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		Ciudadano ciud3 = new Ciudadano();
		ciud3.setNombre("Felipe");
		ciud3.setApellido("Rodriguez");
		
		this.iCiudadanoService.guardar(ciud3);
		
		Empleado empl2 = new Empleado();
		empl2.setFechaIngreso(LocalDateTime.now());
		empl2.setSalario(new BigDecimal(500));
		
		this.iEmpleadoService.guardar(empl2);
		
		Ciudadano ciud4 = new Ciudadano();
		ciud4 = this.iCiudadanoService.buscar(4);
		
		empl2.setCiudadano(ciud4);
		
        Empleado empleadoNuevo = new Empleado();
		
		empleadoNuevo.setFehcaIngreso(LocalDateTime.now());
		empleadoNuevo.setSalario(new BigDecimal(1000));
		
		Ciudadano ciudadanoNuevo = new Ciudadano();
		
		empleadoNuevo.setCiudadano(ciudadanoNuevo);
		ciudadanoNuevo.setNombre("Juan");
		ciudadanoNuevo.setApellido("Perez");
		ciudadanoNuevo.setEmpleado(empleadoNuevo);
	
		
		this.iCiudadanoService.guardar(ciudadanoNuevo);
		*/
	
		Hotel hotel = new Hotel();
		hotel.setDireccion("Colon");
		hotel.setNombre("Marriet");
		
		Habitacion h1 = new Habitacion();
		h1.setClase("Economica");
		h1.setNumero("A1");
		h1.setHotel(hotel);
		
		Habitacion h2 = new Habitacion();
		h2.setClase("Presidencial");
		h2.setNumero("A2");
		h2.setHotel(hotel);
		
		List<Habitacion> habitaciones = new ArrayList<>();
		habitaciones.add(h1);
		habitaciones.add(h2);
		
		hotel.setHabitaciones(habitaciones);
		
		this.iHotelService.guardar(hotel);
		
		Hotel hotel2 = new Hotel();
		Habitacion habi3 = new Habitacion();
		habi3.setClase("Economica");
		habi3.setNumero("B1");
		habi3.setHotel(hotel2);
		
		Habitacion habi4 = new Habitacion();
		habi4.setClase("Economica");
		habi4.setNumero("A2");
		habi4.setHotel(hotel2);
		
		List<Habitacion> habitaciones2 = new ArrayList<>();
		habitaciones2.add(habi3);
		habitaciones2.add(habi4);
		
		hotel2.setDireccion("Av. Florida");
		hotel2.setNombre("Vista del Mar ");
		hotel2.setHabitaciones(habitaciones2);
		
		this.iHotelService.guardar(hotel2);
		this.iHabitacionService.buscar(5);
		habi4.setNumero("B2");
		this.iHabitacionService.actualizar(habi4);
		
	}

}
