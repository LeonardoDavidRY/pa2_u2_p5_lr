package com.uce.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IHotelRepository;
import com.uce.edu.repository.modelo.Hotel;
@Service
public class HotelServiceImpl implements IHotelService {
	
	@Autowired
	private IHotelRepository hotelRepository;
	
	//CRUD Hotel

	@Override
	public void guardar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepository.insertar(hotel);

	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionar(id);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepository.actualizar(hotel);
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.hotelRepository.eliminar(id);
		
	}

	@Override
	public Hotel buscarPorDireccion(String direccion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorDireccion(direccion);
	}

	@Override
	public Hotel buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorNombre(nombre);
	}

	@Override
	public List<Hotel> buscarPorClaseinnerJoin(String claseHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorClaseinnerJoin(claseHabitacion);
	}

	@Override
	public List<Hotel> buscarPorClaseLeftJoin(String claseHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorClaseLeftJoin(claseHabitacion);
	}

	@Override
	public List<Hotel> buscarPorNumeroRightJoin(String numeroHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorNumeroRightJoin(numeroHabitacion);
	}

	@Override
	public List<Hotel> buscarPorNumeroFullJoin(String numeroHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorNumeroFullJoin(numeroHabitacion);
	}

}
