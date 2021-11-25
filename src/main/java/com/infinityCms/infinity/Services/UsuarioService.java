package com.infinityCms.infinity.Services;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.infinityCms.infinity.Models.UsuarioModel;
import com.infinityCms.infinity.Repositories.UsuarioRepository;
import com.infinityCms.infinity.Security.CustomUserDetails;

@Service
public class UsuarioService implements UserDetailsService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	public ArrayList<UsuarioModel> obtenerUsuarios() {
		return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
	}
	
	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(usuario.getPassword());
		usuario.setPassword(encodedPassword);
		
		return usuarioRepository.save(usuario);
	}
	
	public Optional<UsuarioModel> obtenerUsuarioPorId(Long id){
		return usuarioRepository.findById(id);
	}

	
	public boolean eliminarUsuario(Long id) {
		try {
			usuarioRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		UsuarioModel usuarioModel = usuarioRepository.findByEmail(email);
		if (usuarioModel == null) {
			throw new UsernameNotFoundException("Usuario o contrasenia no valida.");
		}
		
		return new CustomUserDetails(usuarioModel);
	}

}
