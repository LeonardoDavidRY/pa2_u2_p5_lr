package com.uce.edu.service;

import java.util.List;

import com.uce.edu.repository.modelo.Hotel;

public interface IHotelService {
	
	//CRUD Hotel
	
	public Hotel buscar(Integer id);
	
	public void guardar (Hotel hotel);
	
	public void actualizar(Hotel hotel);

	public void borrar(Integer id);
	
    public Hotel buscarPorDireccion(String direccion);
	
	public Hotel buscarPorNombre(String nombre);
	
    public List<Hotel> buscarPorClaseinnerJoin(String claseHabitacion);
	
	public List<Hotel> buscarPorClaseLeftJoin(String claseHabitacion);
	
	public List<Hotel> buscarPorNumeroRightJoin(String numeroHabitacion);
	
	public List<Hotel> buscarPorNumeroFullJoin(String numeroHabitacion);

}
