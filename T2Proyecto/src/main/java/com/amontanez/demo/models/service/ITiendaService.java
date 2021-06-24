package com.amontanez.demo.models.service;

import java.util.List;

import com.amontanez.demo.entity.Tienda;

public interface ITiendaService {
	
	public void save(Tienda tienda);
	public List<Tienda> findAll();
	public Boolean verificarExisteTienda(String nombre);
}
