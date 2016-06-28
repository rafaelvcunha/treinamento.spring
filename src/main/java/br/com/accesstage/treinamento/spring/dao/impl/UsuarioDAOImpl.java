package br.com.accesstage.treinamento.spring.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.accesstage.treinamento.spring.dao.UsuarioDAO;
import br.com.accesstage.treinamento.spring.entities.UsuarioEntity;
import br.com.accesstage.treinamento.spring.mapper.CustomUsuarioMapper;

@Repository

public class UsuarioDAOImpl implements UsuarioDAO {

	@Autowired 
	DataSource dsHandsOn;
	
		
	@Override
	public List<UsuarioEntity> listar() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dsHandsOn);
		String sql = "SELECT * FROM handson.tb_usuarios ORDER BY usuario ASC";
		List<UsuarioEntity> result = jdbcTemplate.query(sql, new CustomUsuarioMapper());
		return result;
	}

	@Override
	public void add(UsuarioEntity usuarioEntity) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dsHandsOn);
		String sql = "INSERT INTO handson.tb_usuarios (`nome_completo`, `usuario`, `senha`) VALUES (?,?,?);";
		jdbcTemplate.update(sql, new Object[]{usuarioEntity.getNomeCompleto(),usuarioEntity.getUsuario(),usuarioEntity.getSenha()} );
	}

	@Override
	public void edit(UsuarioEntity usuarioEntity) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dsHandsOn);
		String sql = "UPDATE handson.tb_usuarios SET nome_completo = ?, usuario = ?, senha = ? WHERE codigo = ?;";
		jdbcTemplate.update(sql, new Object[]{usuarioEntity.getNomeCompleto(),usuarioEntity.getUsuario(),usuarioEntity.getSenha(),usuarioEntity.getCodigo()});
	}

	@Override
	public void delete( String usuario ) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dsHandsOn);
		String sql = "DELETE FROM handson.tb_usuarios WHERE usuario =" + usuario +";";
		jdbcTemplate.update(sql);
	}

	@Override
	public UsuarioEntity getUsuarioEntity(String usuario) {
		List<UsuarioEntity> usuarioEntitiesList = new ArrayList<UsuarioEntity>();
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dsHandsOn);
		String sql = "SELECT * FROM handson.tb_usuarios WHERE usuario =" + usuario +";";
		usuarioEntitiesList = jdbcTemplate.query(sql, new CustomUsuarioMapper());
		return usuarioEntitiesList.get(0);
	}

}
