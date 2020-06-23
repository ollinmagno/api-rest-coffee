package com.coffee.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffee.apirest.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario findById(long id);
}
