package br.com.accesstage.treinamento.spring.dao.impl;

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

}
