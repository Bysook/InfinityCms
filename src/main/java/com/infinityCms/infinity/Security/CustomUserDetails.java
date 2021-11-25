package com.infinityCms.infinity.Security;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.infinityCms.infinity.Models.UsuarioModel;

public class CustomUserDetails implements UserDetails{

	private static final long serialVersionUID = 1L;
	private UsuarioModel usuarioModel;

	public CustomUserDetails(UsuarioModel usuarioModel) {
		this.usuarioModel = usuarioModel;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return usuarioModel.getPassword();
	}

	@Override
	public String getUsername() {
		return usuarioModel.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	public String getNameUser() {
		return usuarioModel.getNombre();
	}

}
