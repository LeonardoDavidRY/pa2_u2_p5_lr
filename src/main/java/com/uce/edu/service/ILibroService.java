package com.uce.edu.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;

public interface ILibroService {
	
    public Libro buscar(Integer id);
	
	public void guardar (Libro  libro);
	
	public void actualizar(Libro libro);

	public void borrar(Integer id);
	
	public void guardar (Libro2  libro2);
	
	public Libro buscarPorNombre(String nombre);
	
	public List<Libro> buscarPorFecha(LocalDateTime fecha);
	
	public Libro buscarPorTilulo(String titulo);
	
	public List<Libro> buscarPorFechaPublic(LocalDateTime fechaPublicacion);
	
    public Libro buscarPorTiluloNamed(String titulo);
	
	public List<Libro> buscarPorFechaPublicNamed(LocalDateTime fechaPublicacion);
	

}
