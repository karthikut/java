package com.xworkz.email.service;

import com.xworkz.email.exceptions.ArraySizeNotEnoughException;
import com.xworkz.email.exceptions.EmailBaseLessException;

public class EmailService {

	String[] emails = new String[20];
	int onAdd=0;
	
	public EmailService() {
		System.out.println("created email servicer");
		
		
	}
	
	public boolean onaddEmails(String email) throws EmailBaseLessException{
		
		if (email!=null) {
			
			if (!(email.length()>8 
					&& email.length()<56 
					&& email.contains("@") 
					&& (email.endsWith(".com")
				    || (email.endsWith(".in")
					|| (email.endsWith(".edu")
					|| (email.endsWith(".org"))))))){
						
						System.out.println("email entered is baseless" + email);
						throw new EmailBaseLessException("email entered is baseless");
						
					}else {
						System.out.println(" email has base and can proceed for list" + email);
						if (this.onAdd<this.emails.length) {
							
							this.emails[this.onAdd]=email;
							System.out.println(email + "is added @" + this.onAdd);
							this.onAdd++;
							return true;
						}else {
							System.err.println("list of array is dont have space" + email + "cant be added");
							throw new ArraySizeNotEnoughException("there is not enough space in arraysize");
						}
					}
					
					
		}
		System.err.println("email is null cant be added");
		return false;
		
		
	}

} 
