package com.xworkz.association.hotel.customs;

public class Vendor {
	public String buy;
	public boolean sell;
	public int cost;
    public String name;
    
    
	public Vendor(int cost, String name) {
		super();
		this.cost = cost;
		this.name = name;
	}


	public void buy() {
		System.out.println("buying for it");
		
	}
	
	public  boolean sell(int cost) {
		if(cost>100) {
			System.out.println("going to sell for rs" + cost);
			return true;	
		}
		else {
		return false;
		}
	}

}
