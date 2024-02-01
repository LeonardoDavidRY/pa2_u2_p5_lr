package com.uce.edu.repository;

import java.util.List;

import com.uce.edu.repository.modelo.Hotel;

public interface IHotelRepository {
	
	//CRUD Hotel
	
    public Hotel seleccionar(Integer id);
	
	public void insertar (Hotel  hotel);
	
	public void actualizar(Hotel hotel);

	public void eliminar(Integer id);
	
	public Hotel seleccionarPorDireccion(String direccion);
	
	public Hotel seleccionarPorNombre(String nombre);
	
	public List<Hotel> seleccionarPorClaseinnerJoin(String claseHabitacion);
	
	public List<Hotel> seleccionarPorNumeroinnerJoin(String numeroHabitacion);
	
	public List<Hotel> seleccionarPorClaseLeftJoin(String claseHabitacion);
	
	public List<Hotel> seleccionarPorNumeroLeftJoin(String numeroHabitacion);
	
	public List<Hotel> seleccionarPorNumeroRightJoin(String numeroHabitacion);
	
	public List<Hotel> seleccionarPorClaseRightJoin(String claseHabitacion);
	
	public List<Hotel> seleccionarPorNumeroFullJoin(String numeroHabitacion);
	
	public List<Hotel> seleccionarPorClaseFullJoin(String claseHabitacion);
	
	public List<Hotel> seleccionarPorNumerofetchJoin(String numeroHabitacion);
	
	public List<Hotel> seleccionarPorClasefetchJoin(String claseHabitacion);

}
