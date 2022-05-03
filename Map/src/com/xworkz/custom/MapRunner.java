package com.xworkz.custom;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {
		
		Map<String,String> captainNameiplTeam = new HashMap<>();
		
		
		
		
		captainNameiplTeam.put("virat ", "rcb");
		captainNameiplTeam.put("dhoni", "csk");
		captainNameiplTeam.put("hardik ", "gujarat titans");
		captainNameiplTeam.put("kane", "srh");
		captainNameiplTeam.put("shreyas ", "kolkatta");
		
		captainNameiplTeam.put("pant", "delhi");
		captainNameiplTeam.put("sanju ", "rajastan");
		captainNameiplTeam.put("rahul", "lucknow"); 
		captainNameiplTeam.put("mayank ", "punjab");
		captainNameiplTeam.put("rohit", "mumbai");
		
		captainNameiplTeam.put("faf ", "pune");
		captainNameiplTeam.put("abd", "kochi"); 
		captainNameiplTeam.put("dale ", "telangana");
		captainNameiplTeam.put("maxwell", "ahmedabad");
		captainNameiplTeam.put("dinesh karthik ", "jharkand");
        
        System.out.println(captainNameiplTeam.size());
        
        Set<String> keys= captainNameiplTeam.keySet();
        keys.forEach(r->System.out.println(r));
        
        Collection<String> values = captainNameiplTeam.values();
        values.forEach(e->System.out.println(e));
        
        System.out.println("entry.....");
        
        Set<Entry<String,String>> entrySet = captainNameiplTeam.entrySet();
        entrySet.forEach(e->System.out.println(e.getKey() + " " + e.getValue()));
        
        
        System.out.println("entry......for each functions");
        
        captainNameiplTeam.forEach((k,v)->System.out.println(k +" "+ v));
        
        

	}

}
