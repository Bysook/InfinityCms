package com.infinityCms.infinity.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infinityCms.infinity.Models.UsuarioModel;
import com.infinityCms.infinity.Services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping()
	public ArrayList<UsuarioModel> obtenerUsuarios() {
		return usuarioService.obtenerUsuarios();
	}
	
	@PostMapping
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
		return this.usuarioService.guardarUsuario(usuario);
	}
	
	@GetMapping( path ="/{id}" )
	public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
		return this.usuarioService.obtenerUsuarioPorId(id);
	}
	
	@DeleteMapping( path ="/{id}" )
	public void eliminarPorId(@PathVariable("id") Long id) {
		this.usuarioService.eliminarUsuario(id);
	}

}
