package com.uce.edu;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Alumno;
import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.service.IAlumnoService;
import com.uce.edu.service.IEstudianteService;

@SpringBootApplication
public class Pa2U2P5LrApplication implements CommandLineRunner{
	@Autowired
	private IEstudianteService iEstudianteService;
	
	@Autowired
	private IAlumnoService iAlumnoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5LrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//1- seleccionar
		/*
		Estudiante estu = new Estudiante();
		estu.setApellido("Jimenez");
		estu.setCedula("1785789657");
		estu.setNombre("Alejandro");
		estu.setFechaNacimiento(LocalDateTime.of(2000, 07, 07, 07, 50));
		
		this.iEstudianteService.guardar(estu);
		
		//2 buscar
		Estudiante estu1 = this.iEstudianteService.buscar(4);
		System.out.println(estu1);
		// 3 Actualizar
		estu1.setNombre("David");
		this.iEstudianteService.actualizar(estu1);
		
		Alumno alum1= new Alumno();
		alum1.setNombre("Victor");
		this.iAlumnoService.guardar(alum1);
		*/
		Alumno alum2= this.iAlumnoService.buscar(3);
		System.out.println(alum2);
		
		this.iAlumnoService.borrar(2);
	
		
		
	}

}
