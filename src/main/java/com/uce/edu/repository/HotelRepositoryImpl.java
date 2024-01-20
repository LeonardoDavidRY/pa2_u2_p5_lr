package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Ciudadano;
import com.uce.edu.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class HotelRepositoryImpl implements IHotelRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	//CRUD Hotel

	@Override
	public Hotel seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Hotel.class, id);
	}

	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);

	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.merge(hotel);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Hotel hotel = this.seleccionar(id);
		this.entityManager.remove(hotel);

	}

	@Override
	public Hotel seleccionarPorDireccion(String direccion) {
		// TODO Auto-generated method stub
		Query myQuery =this.entityManager.createNativeQuery("SELECT * FROM hotal h WHERE h.hote_direccion  = :direccion ", Hotel.class);
		myQuery.setParameter("direccion", direccion);
		return (Hotel) myQuery.getSingleResult();
	}

	@Override
	public Hotel seleccionarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery =this.entityManager.createNativeQuery("SELECT * FROM hotal h WHERE h.hote_nombre  = :nombre ", Hotel.class);
		myQuery.setParameter("nombre", nombre);
		return (Hotel) myQuery.getSingleResult();
	}

}
