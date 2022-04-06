package com.xworkz.association.hotel;

import com.xworkz.association.hotel.customs.Vendor;

public class hotel {
	
	public String name="irish house";
	private int star=5;
	public Hoteltype type;
	private Vendor vendor;
	public String string;
	

	public hotel(String name, int star, Hoteltype type, String string) {
		super();
		this.name = name;
		this.star = star;
		this.type = type;
		this.string = string;
		System.out.println("hotel association");
	}
	
	public int getStar() {
		return this.star;
	}
	
	public void setStar(int star) {
		 this.star=star;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void buyMasala() {
		name.charAt('4');
		vendor.sell(90);
		System.out.println(vendor.sell);
	}

}
