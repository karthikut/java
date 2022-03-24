package com.xworkz.encapsulation.dto;

public class PersonDTO{
	
	private String name;
	private String caste;
	private boolean whiteColor;
	private boolean disabled;
	private String citizenship;
	private int age;
	private double hieght;
	
	public PersonDTO(){
		
	}
	
	public PersonDTO(String name) {
    this.name=name; 
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		 this.name=name;
	}
	
	public PersonDTO(int age) {
		this.age=age;
	}
	
	public int getage()
	{
		return this.age;
	}
	
	
	public void setAge(int age)
	{
		 this.age=age;
	}
	
	
	public PersonDTO(double hieght) {
		this.hieght=hieght;
	}
	
	public double gethieght()
	{
		return this.hieght;
	}
	
	
	public void setHieght(double hieght)
	{
		 this.hieght=hieght;
	}
	
	
	
	
	
	public void PersonDTO(String caste) {
	    this.caste=caste; 
		}
		
		public String getCaste()
		{
			return this.caste;
		}
		
		public void setCaste(String caste)
		{
			 this.caste=caste;
		}
		
		
		public void PersonDTO1(String citizenship) {
		    this.citizenship=citizenship; 
			}
			
			public String getcitizenship()
			{
				return this.citizenship;
			}
			
			public void setCitizenship(String citizenship)
			{
				 this.citizenship=citizenship;
			}
	

	public void setwhiteColor(boolean whiteColor ) {
		// TODO Auto-generated method stub
		this.whiteColor=whiteColor;	
	}
	
	public boolean isWhiteColor()
	{
		return this.whiteColor;
	}
	
	
	public void setdisabled (boolean disabled) {
		this.disabled=disabled;
	}
	
	public boolean isDisabled() {
		return this.disabled;
	}
		
	
	}
	
	
	


