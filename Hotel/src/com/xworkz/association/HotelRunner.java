package com.xworkz.association;

import com.xworkz.association.hotel.Hoteltype;
import com.xworkz.association.hotel.hotel;
import com.xworkz.association.hotel.customs.Vendor;


public class HotelRunner {

	private static final String name = "IRISH";

	public static <Hotel> void main(String[] args) {
		
		hotel hotel1=new hotel("IRISH HOUSE",520,Hoteltype.veg, "jet");
		System.out.println(hotel1.getName());
		
		
		System.out.println(hotel1.name);
		System.out.println(hotel1.getStar());
		System.out.println(hotel1.type);
		
		
		System.out.println(name.charAt(4));
		
		hotel hotel2=new hotel("ram", 0,null, "hjg");
		System.out.println(hotel2.name);
		System.out.println(hotel1.string);
		
		Vendor vendor=new Vendor(400,"ajax");
		System.out.println(vendor.cost);
		System.out.println(vendor.name);
		System.out.println(vendor.sell);
		System.out.println();
		System.out.println(vendor.buy);
		
	}

}
