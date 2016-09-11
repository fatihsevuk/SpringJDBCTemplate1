package com.fatih.service;

import java.util.List;

import com.fatih.dao.impl.KisiDAOImpl;
import com.fatih.model.Kisi;

public class KisiDAOService {
	
	private KisiDAOImpl kisiDAOImpl;

	
	
	public KisiDAOService(KisiDAOImpl kisiDAOImpl) {
		
		this.kisiDAOImpl = kisiDAOImpl;
	}
	
	public void kisiEkle(Kisi kisi){
		kisiDAOImpl.kisiEkle(kisi);
	}
	
	public Kisi kisiBulById(int kisiId){
		return kisiDAOImpl.kisiBulById(kisiId);
	}
	
	public List tumKisileriListele(){
		return kisiDAOImpl.tumKisileriListele();
		
	}
	
	public void guncelle(Kisi kisi){
		
		kisiDAOImpl.guncelle(kisi);
	}
	
	public void kisiSilById(int kisiId) {
		kisiDAOImpl.kisiSilById(kisiId);
	}
	
	public Kisi kisiOlustur(int kisiId,String ad,int yas){
		Kisi kisi=new Kisi(kisiId,ad,yas);
		return kisi;
	}

}
