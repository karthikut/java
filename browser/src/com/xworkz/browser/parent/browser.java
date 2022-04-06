package com.xworkz.browser.parent;

public abstract class browser {
	
	private String name;
	private double version;
	private String company;
	
	public browser(String name,double version,String company) {
		
		this.name=name;
		this.version=version;
		this.company=company;
	}

	public void connect() {
	
		System.out.println("connecting to server");
	}

	public abstract void developerTool();
	
	public abstract void showTime();
	
	public String getName() {
	return this.name;
	}
	
	public double getVersion() {
	return this.version;
	}
	
	public String getCompany() {
	return this.company;	
	}
	
	
	}
	
	
	
	
	
}


