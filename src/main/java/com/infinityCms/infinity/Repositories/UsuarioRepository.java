package com.infinityCms.infinity.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.infinityCms.infinity.Models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
	UsuarioModel findByEmail(String email);
}
