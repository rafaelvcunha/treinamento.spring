package br.com.accesstage.treinamento.spring.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.accesstage.treinamento.spring.entities.UsuarioEntity;

public class CustomUsuarioMapper implements RowMapper<UsuarioEntity>{
	
	@Override
	public UsuarioEntity mapRow(ResultSet rs, int rowNum) throws SQLException{
		
		UsuarioEntity usuario = new UsuarioEntity();
		
		usuario.setCodigo(rs.getLong("codigo"));
		usuario.setNomeCompleto(rs.getString("nome_completo"));
		usuario.setUsuario(rs.getString("usuario"));
		usuario.setSenha(rs.getString("senha"));
		
		return usuario;
	}
	

}
