class Product {
	private String naam;
	private float prijs;
	private int korting;
	
	public String getNaam() {
		return this.naam;
	}
	
	public void setNaam(String n) {
		this.naam = n;
	}
	
	public int getKorting() {
		return this.korting;
	}
	
	public void setKorting(int k){
		if (k < 50) {
			this.korting = k;
		}
	}
}


class Offerte {
	void begin() {
		
		Product product1 = new Product();
		Product product2 = new Product();
				
		product1.setKorting(40);
		product1.naam = "Microfoon";		

		product2.setKorting(20);
		product2.naam = "Luidspreker";	
		System.out.println("Het kortingspercentage van de " + product2.naam + " is " + product2.getKorting());
	}
}