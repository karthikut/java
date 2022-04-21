package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PanCard {

	public static <E> void main(String[] args) {
		
		
		
		
		
		Collection<E> pancard=new ArrayList<E>();
		pancard.add((E) "jhvbjnhhb5415");
		pancard.add((E) "hgjvvjbbjhvjv");
		pancard.add((E) "4581hhjftdcvh");
		pancard.add((E) "2588vvnhuyhvjv");
		pancard.add((E) "h2718jbberwvjv");
		pancard.add((E) "457nhjbberwvjv");
		
		Iterator itr = pancard.iterator();
		while(itr.hasNext()) {
			Object ids = itr.next();
			System.out.println(ids);
			
			System.out.println(pancard.size());
			
			System.out.println(pancard.contains("4581hhjftdcvh"));
			
			System.out.println(pancard.contains("jhvhgcc"));
			
			System.out.println(pancard.isEmpty());
			
			System.out.println(pancard.containsAll(pancard));
			
			 try {
				System.out.println(pancard.containsAll(null));
			} catch (Exception e) {
				System.out.println("null pointer exception");
				e.printStackTrace();
			}
			
		}
		
	}

}
