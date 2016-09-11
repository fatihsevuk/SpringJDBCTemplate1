package com.fatih.dao;

import java.util.List;

import com.fatih.model.Kisi;

public interface KisiDAO {
	
	
	public void kisiEkle(Kisi kisi);
	public Kisi kisiBulById(int kisiId);
	public List<Kisi> tumKisileriListele();
	public void guncelle(Kisi kisi);
	public void kisiSilById(int kisiId);	

}
