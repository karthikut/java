package com.xworkz.email;

import com.xworkz.email.exceptions.ArraySizeNotEnoughException;
import com.xworkz.email.exceptions.EmailBaseLessException;
import com.xworkz.email.service.EmailService;

public class EmailRunner {

	public static void main(String[] args) {
		EmailService emailService= new EmailService();
		
		try {
			
			
			
		
			emailService.onaddEmails("ranjitmk@gmail.com");
			emailService.onaddEmails("sudhakf@gmail.edu");
			emailService.onaddEmails("vksingh@gmail.in");
			emailService.onaddEmails("goswamymk@gmail.org");
			emailService.onaddEmails("mallikarjun@gmail.com");
			emailService.onaddEmails("vineshwar@gmail.com");
			emailService.onaddEmails("rajmk@gmail.in");
			emailService.onaddEmails(null);
			
			emailService.onaddEmails("sony@gmail.org");
			emailService.onaddEmails("yuvih@gmail.com");
			emailService.onaddEmails("ramk@gmail.edu");
			emailService.onaddEmails("omkarmn@gmail.com");
			emailService.onaddEmails("abhisk@gmail.edu");
			emailService.onaddEmails("krish@gmail.in");
			
			emailService.onaddEmails("hritiklm@gmail.com");
			emailService.onaddEmails("rambokl@gmail.in");
			emailService.onaddEmails("anishtyk@gmail.com");
			emailService.onaddEmails("ankitavb@gmail.org");
			emailService.onaddEmails("hemanthkm@gmail.com");
			emailService.onaddEmails("kirandf@gmail.edu");
			emailService.onaddEmails("sangeetauj@gmail.com");
			emailService.onaddEmails("laxmih@gmail.in");
			
		}
		
		catch (EmailBaseLessException e) {
			e.printStackTrace();
			
		}
		
		catch (ArraySizeNotEnoughException e) {
			e.printStackTrace();
		}
		

	}

}
