package com.xworkz.encapsulation.dto;

public class PersonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonDTO personDTO= new PersonDTO();
		personDTO.setName("vinay");
		
		String name= personDTO.getName();
		
		System.out.println(name);
		
		
		
		personDTO.setCaste("hindu");
		
		String caste= personDTO.getCaste();
		
		System.out.println(caste);
		
		
		
		personDTO.setAge(24);
		
		int age= personDTO.getage();
		
		System.out.println(age);
		
		
		
		personDTO.setHieght(6.52);
		
		double hieght= personDTO.gethieght();
		
		System.out.println(hieght);
		
		
		
		personDTO.setCitizenship("INDIAN");
		
		String citizenship= personDTO.getcitizenship();
		
		System.out.println(citizenship);
		
		
		
		personDTO.setwhiteColor(true);
		
		boolean whiteColor=personDTO.isWhiteColor();
		
		System.out.println(whiteColor);
		
		
		
		personDTO.setdisabled(false);
		
		boolean disabled=personDTO.isDisabled();
		
		System.out.println(disabled);
		
		
		}

}
