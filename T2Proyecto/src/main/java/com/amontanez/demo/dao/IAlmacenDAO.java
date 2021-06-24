package com.amontanez.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.amontanez.demo.entity.Almacen;
import com.amontanez.demo.entity.Categoria;

public interface IAlmacenDAO extends CrudRepository<Almacen, Long>{
	
	public List<Almacen> findBynombrealmacen (String nombrealmacen);
}
