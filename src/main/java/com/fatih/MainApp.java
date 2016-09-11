package com.fatih;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fatih.model.Kisi;
import com.fatih.service.KisiDAOService;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("app-config.xml");
		
		KisiDAOService kisiService=context.getBean("kisiDAOServiceId",KisiDAOService.class);
		
		Kisi kisi=kisiService.kisiOlustur(23, "tarık", 29);
		
		//kisiService.kisiEkle(kisi);
		
		//kisiService.kisiBulById(7);
		
		//kisi.setYas(70);
		
		//kisiService.guncelle(kisi);
		
		//kisiService.kisiSilById(6);
		
		kisiService.tumKisileriListele();
		
		((ClassPathXmlApplicationContext) context).close();
		
		
		

	}

}
