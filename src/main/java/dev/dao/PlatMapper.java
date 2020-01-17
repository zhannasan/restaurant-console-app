package dev.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import dev.entite.Plat;

public class PlatMapper implements RowMapper<Plat> {

	@Override
	public Plat mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plat p = new Plat();
		p.setId(rs.getInt("id"));
		p.setNom(rs.getString("nom"));
		p.setPrixEnCentimesEuros(rs.getInt("prixEnCentimesEuros"));
		return p;
	}

}
