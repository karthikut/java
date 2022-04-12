package com.xworkz.photography;

import com.xworkz.photography.dao.CameraDAO;
import com.xworkz.photography.dao.CameraDAOImplementation;
import com.xworkz.photography.dto.CameraDTO;

public class CameraRunner {

	public static void main(String[] args) {
		
		CameraDAO dao= new CameraDAOImplementation();
		CameraDAOImplementation castedDAO=(CameraDAOImplementation) dao;
		
		
		CameraDTO dto1 = new CameraDTO();
		dto1.setCameraId(123654);
		dto1.setCost(10000);
		dto1.setName("nikon");
		dto1.setPixels(20);
		dto1.setType("dslr");
		
		CameraDTO dto2 = new CameraDTO();
		dto2.setCameraId(45263);
		dto2.setCost(15000);
		dto2.setName("sony");
		dto2.setPixels(10);
		dto2.setType("instant");
		
		CameraDTO dto3 = new CameraDTO();
		dto3.setCameraId(47514);
		dto3.setCost(30000);
		dto3.setName("cannon");
		dto3.setPixels(30);
		dto3.setType("mobile");
		
		CameraDTO dto4 = new CameraDTO();
		dto4.setCameraId(48554);
		dto4.setCost(50000);
		dto4.setName("samsung");
		dto4.setPixels(40);
		dto4.setType("film");
		
		CameraDTO dto5 = new CameraDTO();
		dto5.setCameraId(12784);
		dto5.setCost(60000);
		dto5.setName("huwai");
		dto5.setPixels(60);
		dto5.setType("dslr");
		
		
		CameraDTO dto0= castedDAO.findByMaxCost();
		System.out.println(dto0);
		
		CameraDTO dto51= castedDAO.findByMinCost();
		System.out.println(dto51);
		
		CameraDTO dto31= castedDAO.findById(123654);
		System.out.println(dto31);

		

		
		
	}

}
