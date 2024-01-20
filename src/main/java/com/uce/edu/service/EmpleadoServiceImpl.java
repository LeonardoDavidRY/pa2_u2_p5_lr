package com.uce.edu.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IEmpleadoRepository;
import com.uce.edu.repository.modelo.Empleado;
@Service
public class EmpleadoServiceImpl implements IEmpleadoService {
	@Autowired
	private IEmpleadoRepository iEmpleadoRepository;

	@Override
	public void guardar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.iEmpleadoRepository.insertar(empleado);
		

	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iEmpleadoRepository.seleccionar(id);
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.iEmpleadoRepository.actualizar(empleado);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iEmpleadoRepository.eliminar(id);
		
	}

	@Override
	public List<Empleado> buscarPorEmpleadoSalario(BigDecimal salario) {
		// TODO Auto-generated method stub
		return this.iEmpleadoRepository.seleccionarPorEmpleadoSalario(salario);
	}

	@Override
	public List<Empleado> buscarPorFechaIngreso(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		return this.iEmpleadoRepository.seleccionarPorFechaIngreso(fechaIngreso);
	}

}
