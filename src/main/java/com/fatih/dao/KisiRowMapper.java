package com.fatih.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fatih.model.Kisi;

public class KisiRowMapper implements RowMapper<Kisi>{

	public Kisi mapRow(ResultSet rs, int satirNo) throws SQLException {
		
		Kisi kisi=new Kisi();
		
		kisi.setKisiId(rs.getInt("kisiID"));
		kisi.setAd(rs.getString("ad"));
		kisi.setYas(rs.getInt("yas"));
		
		
		
		return kisi;
		

	}

	

}
