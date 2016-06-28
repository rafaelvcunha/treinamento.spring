package br.com.accesstage.treinamento.spring.service;

import java.util.List;

import br.com.accesstage.treinamento.spring.entities.UsuarioEntity;

public interface UsuarioService {
	
	List<UsuarioEntity> listar();
	public void add(UsuarioEntity usuarioEntity);
	public void edit(UsuarioEntity usuarioEntity);
	public void delete( String usuario );
	public UsuarioEntity getUsuarioEntity( String usuario );

}
