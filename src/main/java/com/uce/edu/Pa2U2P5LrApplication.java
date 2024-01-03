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
import com.uce.edu.service.IHotelService;

@SpringBootApplication
public class Pa2U2P5LrApplication implements CommandLineRunner{
	@Autowired
	private ICiudadanoService iCiudadanoService;
	
	@Autowired
	private IEmpleadoService iEmpleadoService;
	
	@Autowired
	private IHotelService iHotelService;

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
		
	}

}
