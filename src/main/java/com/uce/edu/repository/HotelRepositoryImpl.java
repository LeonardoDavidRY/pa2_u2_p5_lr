package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Hotel;
import com.uce.edu.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepositoryImpl implements IHotelRepository {

	@PersistenceContext
	private EntityManager entityManager;

	// CRUD Hotel

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
		// 0. Creamos una instancia de la interfaz CriterialBuilder a partir de entity
		// Manager
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		// 1. Determinamos el tipo de retorno que va a tener mi consulta
		CriteriaQuery<Hotel> myCriteriaQuery = myCriteriaBuilder.createQuery(Hotel.class);
		// 2. Contruir el SQL
		// 2.1- Determinamos el from (Root)
		// Nota: No necesariamente el from es igual al tipo de retorno
		Root<Hotel> myFrom = myCriteriaQuery.from(Hotel.class);
		// 2.2- Contruir las condiciones (WHERE) del SQL
		// En criteria API Query las condiciones se las conoce como "Predicate"
		// c.apellido = :variable
		Predicate condicionDireccion = myCriteriaBuilder.equal(myFrom.get("direccion"), direccion);

		// 3. Construimos el SQL final
		myCriteriaQuery.select(myFrom).where(condicionDireccion);

		// 4. Ejecutamos la consulta con un typed Query

		TypedQuery<Hotel> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Hotel seleccionarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		// 0. Creamos una instancia de la interfaz CriterialBuilder a partir de entity
		// Manager
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		// 1. Determinamos el tipo de retorno que va a tener mi consulta
		CriteriaQuery<Hotel> myCriteriaQuery = myCriteriaBuilder.createQuery(Hotel.class);
		// 2. Contruir el SQL
		// 2.1- Determinamos el from (Root)
		// Nota: No necesariamente el from es igual al tipo de retorno
		Root<Hotel> myFrom = myCriteriaQuery.from(Hotel.class);
		// 2.2- Contruir las condiciones (WHERE) del SQL
		// En criteria API Query las condiciones se las conoce como "Predicate"
		// c.apellido = :variable
		Predicate condicionNombre = myCriteriaBuilder.equal(myFrom.get("nombre"), nombre);

		// 3. Construimos el SQL final
		myCriteriaQuery.select(myFrom).where(condicionNombre);

		// 4. Ejecutamos la consulta con un typed Query

		TypedQuery<Hotel> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

}
