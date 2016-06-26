package br.com.accesstage.treinamento.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.accesstage.treinamento.spring.dao.UsuarioDAO;
import br.com.accesstage.treinamento.spring.entities.UsuarioEntity;
import br.com.accesstage.treinamento.spring.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	UsuarioDAO usuarioDAO;
	
	@Override
	public List<UsuarioEntity> listar() {
		return usuarioDAO.listar();
	}

}
