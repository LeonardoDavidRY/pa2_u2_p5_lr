package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Empleado;

public interface IEmpleadoRepository {
	
	public Empleado seleecionar(Integer id);
	public void insertar (Empleado  empleado);

}
