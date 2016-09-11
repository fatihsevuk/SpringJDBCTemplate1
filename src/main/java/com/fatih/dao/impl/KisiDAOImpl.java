package com.fatih.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.fatih.dao.KisiDAO;
import com.fatih.dao.KisiRowMapper;
import com.fatih.model.Kisi;

public class KisiDAOImpl implements KisiDAO{
	
	private JdbcTemplate jdbcTemplate;
	
	private final static String KISI_EKLE = "insert into kisiler (kisiId, ad,yas) values (?, ?, ?)";
	private final static String KISI_BUL = "select * from kisiler where kisiId=?";
	private final static String TUM_KISILERI_LISTELE = "select * from kisiler";
	private final static String KISI_GUNCELLE = "update kisiler set ad=? , yas=? where kisiId=?";
	private final static String KISI_SIL = "delete from kisiler where kisiId=?";
	
	public void setDataSource(DataSource dataSource){
		jdbcTemplate=new JdbcTemplate(dataSource);
	}
	
	

	public void kisiEkle(Kisi kisi) {
		Object[] insertParams=new Object[]{kisi.getKisiId(),kisi.getAd(),kisi.getYas()};
		
		jdbcTemplate.update(KISI_EKLE,insertParams);
		
		System.out.println("kisi eklendi "+kisi);
	}

	public Kisi kisiBulById(int kisiId) {
		
		Object[] selectParams=new Object[]{kisiId};
		
		Kisi kisi =jdbcTemplate.queryForObject(KISI_BUL, selectParams,new KisiRowMapper());
		
		System.out.println("kisi bulundu" +kisi);
		
		
		return kisi;
	}

	public List<Kisi> tumKisileriListele() {
		
		List<Kisi> kisiList=jdbcTemplate.query(TUM_KISILERI_LISTELE, new KisiRowMapper());
		
		System.out.println("kisi listesi");
		
		for(Kisi kisi : kisiList){
			System.out.println(kisi);
		}
		
		
		return kisiList;
	}

	public void guncelle(Kisi kisi) {
		
		
		Object[] insertParams = new Object[]{kisi.getKisiId(), kisi.getAd(), kisi.getYas()};
		jdbcTemplate.update(KISI_GUNCELLE, insertParams);
		// logging
		System.out.println("Kisi güncellendi" + kisi);
		
		
	}

	public void kisiSilById(int kisiId) {
		jdbcTemplate.update(KISI_SIL, kisiId);
		// logging
		System.out.println("Kisi Silindi" + kisiId);
		
	}

}
