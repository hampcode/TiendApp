package com.tiendapp.facturacion.app.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.tiendapp.facturacion.app.models.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
}
