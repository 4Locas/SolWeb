package com.amontanez.demo.models.service;

import java.util.List;

import com.amontanez.demo.entity.Categoria;

public interface ICategoriaService {
	public void save(Categoria categoria);
	public List<Categoria> findAll();
	public Boolean verificarExisteCategoria(String nombre);
	
}
