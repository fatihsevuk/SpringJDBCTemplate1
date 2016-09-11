package com.fatih.model;

public class Kisi {
	private int kisiId;
	private String ad;
	private int yas;

	public Kisi() {
		super();
	}
	
	
	
	
	
	
	public Kisi(int kisiId, String ad, int yas) {
		super();
		this.kisiId = kisiId;
		this.ad = ad;
		this.yas = yas;
	}






	public int getKisiId() {
		return kisiId;
	}
	/**
	 * @param kisiId the kisiId to set
	 */
	public void setKisiId(int kisiId) {
		this.kisiId = kisiId;
	}
	/**
	 * @return the ad
	 */
	public String getAd() {
		return ad;
	}
	/**
	 * @param ad the ad to set
	 */
	public void setAd(String ad) {
		this.ad = ad;
	}
	/**
	 * @return the yas
	 */
	public int getYas() {
		return yas;
	}
	/**
	 * @param yas the yas to set
	 */
	public void setYas(int yas) {
		this.yas = yas;
	}






	
	@Override
	public String toString() {
		return "Kisi [kisiId=" + kisiId + ", ad=" + ad + ", yas=" + yas + "]";
	}
	
	
	
	

}
