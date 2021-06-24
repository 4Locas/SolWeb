package com.amontanez.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.amontanez.demo.entity.Usuarios;

public interface IUsuariosDAO extends CrudRepository<Usuarios, Long>{
	
	public Usuarios findByUsername(String username);
}
