package com.uce.edu.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Empleado;
import com.uce.edu.repository.modelo.Habitacion;
import com.uce.edu.repository.modelo.Habitacion;

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
public class HabitacionRepositoryImpl implements IHabitacionRepository {

	@PersistenceContext
	private EntityManager entityManager;

	// CRUD Habitacion

	@Override
	public Habitacion seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Habitacion.class, id);
	}

	@Override
	public void insertar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(habitacion);

	}

	@Override
	public void actualizar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.entityManager.merge(habitacion);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Habitacion habitacion = this.seleccionar(id);
		this.entityManager.remove(habitacion);

	}

	@Override
	public Habitacion seleccionarPorNumero(String numero) {
		// TODO Auto-generated method stub
		// 0. Creamos una instancia de la interfaz CriterialBuilder a partir de entity
		// Manager
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		// 1. Determinamos el tipo de retorno que va a tener mi consulta
		CriteriaQuery<Habitacion> myCriteriaQuery = myCriteriaBuilder.createQuery(Habitacion.class);
		// 2. Contruir el SQL
		// 2.1- Determinamos el from (Root)
		// Nota: No necesariamente el from es igual al tipo de retorno
		Root<Habitacion> myFrom = myCriteriaQuery.from(Habitacion.class);
		// 2.2- Contruir las condiciones (WHERE) del SQL
		// En criteria API Query las condiciones se las conoce como "Predicate"
		// c.apellido = :variable
		Predicate condicionNumero = myCriteriaBuilder.equal(myFrom.get("numero"), numero);

		// 3. Construimos el SQL final
		myCriteriaQuery.select(myFrom).where(condicionNumero);

		// 4. Ejecutamos la consulta con un typed Query

		TypedQuery<Habitacion> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public List<Habitacion> seleccionarPorClase(String clase) {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion> myQuery = this.entityManager
				.createQuery("SELECT h FROM Habitacion h WHERE h.clase = :clase", Habitacion.class);
		myQuery.setParameter("clase", clase);

		return myQuery.getResultList();
	}

}
