package com.uce.edu.service;

import java.util.List;

import com.uce.edu.repository.modelo.Habitacion;

public interface IHabitacionService {
	
	//CRUD Habitacion
	
    public Habitacion buscar(Integer id);
	
	public void guardar (Habitacion  habitacion);
	
	public void actualizar(Habitacion habitacion);

	public void borrar(Integer id);
	
    public Habitacion buscarPorNumero(String numero);
	
	public List<Habitacion> buscarPorClase(String clase);

}
