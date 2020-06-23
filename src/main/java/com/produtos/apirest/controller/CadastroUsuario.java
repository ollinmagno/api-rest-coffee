package com.produtos.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.models.Usuario;
import com.produtos.apirest.repository.UsuarioRepository;

@RestController
public class CadastroUsuario {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@RequestMapping(value = "/usuarios", method = RequestMethod.GET, produces = "applications/json")
	@GetMapping("/usuarios")
	public List<Usuario> listaUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario encontrarUsuarioId(@PathVariable(value="id") long id) {
		return usuarioRepository.findById(id);
	}
	
	@RequestMapping(value = "/usuarios", method = RequestMethod.POST, 
	consumes = "applications/json", produces = "applications/json")
	@PostMapping("/usuario")
	public Usuario cadastraUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
}
