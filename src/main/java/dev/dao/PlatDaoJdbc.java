package dev.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dev.entite.Plat;
@Repository
public class PlatDaoJdbc implements IPlatDao{
	
//	private List<Plat> plats = new ArrayList<>();
	private JdbcTemplate jdbcTemplate;
	
	@Autowired // injection de la source de données
	public PlatDaoJdbc(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	@Override
	public List<Plat> listerPlats() {
		String sql = "SELECT * FROM plat";
		List<Plat> plats = jdbcTemplate.query(sql, new PlatMapper());
		return plats;
	}

	@Override
	public void ajouterPlat(String nomPlat, Integer prixPlat) {
		String sql = "INSERT INTO plat(nom, prixEnCentimesEuros) values(?,?)";
		this.jdbcTemplate.update(sql, nomPlat, prixPlat);
	}

}
