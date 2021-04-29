package com.eventoapp.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.eventoapp.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {
	Usuario findByLogin(String login);
}
