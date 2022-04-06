package com.xworkz.browser;

import com.xworkz.browser.parent.browser;
import com.xworkz.browser.sub.Mozillabrowser;


public class BrowserRunner {

	public static void main(String[] args) {
		
		
		
		
		browser browser1=new Mozillabrowser("firefox", 51.0d, "firefoxcorp"); 
        System.out.println(browser1.getName());
        System.out.println(browser1.getVersion());
        System.out.println(browser1.getCompany());
        browser1.connect();
        
        Mozillabrowser castedbrowser=(Mozillabrowser)browser1;
		
	}

}
