package com.amontanez.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.amontanez.demo.entity.Empleado;

public interface IEmpleadoDAO extends CrudRepository<Empleado, Long>{
	public List<Empleado> findBynombre (String nombre);

}
