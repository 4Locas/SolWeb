package com.amontanez.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.amontanez.demo.entity.Productos;

public interface IProductoDAO extends CrudRepository<Productos, Long>{
	
}
