package com.amontanez.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.amontanez.demo.entity.Productos;

public interface IProductoDAO extends CrudRepository<Productos, Long>{
	public List<Productos> findBynombre	(String nombre);
}
