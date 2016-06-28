package br.com.accesstage.treinamento.spring.dao;

import java.util.List;

import br.com.accesstage.treinamento.spring.entities.UsuarioEntity;

public interface UsuarioDAO {
	
	public List<UsuarioEntity> listar();
	
	//26/06/2016
	public void add(UsuarioEntity usuarioEntity);
	public void edit(UsuarioEntity usuarioEntity);
	public void delete( String usuario );
	public UsuarioEntity getUsuarioEntity( String usuario );
	
}
