package com.amontanez.demo.models.service;



import java.util.List;

import com.amontanez.demo.entity.Usuario;

public interface IUsuarioService {
	public void save(Usuario usuario);
	public List<Usuario> findAll();
}
