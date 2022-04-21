package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Aadhar {

	public static <E> void main(String[] args) {
		
		
		Collection<E> aadhar= new ArrayList<E>();
		 aadhar.add((E) "4598263");
		 aadhar.add((E) "1425896");
		 aadhar.add((E) "7485121");
		 aadhar.add((E) "5896541");
		 aadhar.add((E) "4258712");
		 
		
		java.util.Iterator itr=aadhar.iterator();
		while(itr.hasNext()) {
		Object no=itr.next();
		System.out.println(no);
		
		System.out.println(aadhar.size());
		
		System.out.println(aadhar.contains("4258712"));
		}

	}

}
