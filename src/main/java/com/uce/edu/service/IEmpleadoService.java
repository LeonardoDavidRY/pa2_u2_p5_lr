package com.uce.edu.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.repository.modelo.Empleado;

public interface IEmpleadoService {
	
	public Empleado buscar(Integer id);

	public void guardar(Empleado empleado);

	public void actualizar(Empleado empleado);

	public void borrar(Integer id);
	
    public List<Empleado> buscarPorEmpleadoSalario(BigDecimal salario);
	
	public List<Empleado> buscarPorFechaIngreso(LocalDateTime fechaIngreso );

}
