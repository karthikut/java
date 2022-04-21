package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Car {

	public static <E> void main(String[] args) {
		
		
		
		
		Collection<E> car= new ArrayList<E>();
		car.add((E) "BMW");
		car.add((E) "AUDI");
		car.add((E) "BENZ");
		car.add((E) "TATA");
		car.add((E) "FERRARI");
		car.add((E) "MASTANG");
		
		java.util.Iterator itr=car.iterator();
		while(itr.hasNext()) {
		Object name=itr.next();
		System.out.println(name);
		
		System.out.println(car.contains("FERRARI"));
		
		System.out.println(car.size());
		}
	}

}
