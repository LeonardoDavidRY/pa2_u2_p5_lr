package com.uce.edu.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ILibroRepository;
import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;
@Service
public class LibroServiceImpl implements ILibroService {
	
	@Autowired
	private ILibroRepository libroRepository;

	@Override
	public Libro buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.libroRepository.seleccionar(id);
	}

	@Override
	public void guardar(Libro libro) {
		// TODO Auto-generated method stub
		this.libroRepository.insertar(libro);

	}

	@Override
	public void actualizar(Libro libro) {
		// TODO Auto-generated method stub
		this.libroRepository.actualizar(libro);

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.libroRepository.eliminar(id);

	}

	@Override
	public void guardar(Libro2 libro2) {
		// TODO Auto-generated method stub
		this.libroRepository.insertar(libro2);
		
	}

	@Override
	public Libro buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.libroRepository.seleccionarPorNombre(nombre);
	}

	@Override
	public List<Libro> buscarPorFecha(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.libroRepository.seleccionarPorFechaPublicacion(fecha);
	}

	@Override
	public Libro buscarPorTilulo(String titulo) {
		// TODO Auto-generated method stub
		return this.libroRepository.seleccionarPorTitulo(titulo);
	}

	@Override
	public List<Libro> buscarPorFechaPublic(LocalDateTime fechaPublicacion) {
		// TODO Auto-generated method stub
		return this.libroRepository.seleccionarPorFecha(fechaPublicacion);
	}

	@Override
	public Libro buscarPorTiluloNamed(String titulo) {
		// TODO Auto-generated method stub
		return this.libroRepository.seleccionarPorTituloNamed(titulo);
	}

	@Override
	public List<Libro> buscarPorFechaPublicNamed(LocalDateTime fechaPublicacion) {
		// TODO Auto-generated method stub
		return this.libroRepository.seleccionarPorFechaNamed(fechaPublicacion);
	}

}
