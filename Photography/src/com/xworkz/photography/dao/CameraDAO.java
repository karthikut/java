package com.xworkz.photography.dao;

import com.xworkz.photography.dto.CameraDTO;

public abstract class CameraDAO {

	private CameraDTO[] cameraDTOs = new CameraDTO[5];


	protected CameraDAO() {
		System.out.println("create" + getClass().getSimpleName());
	}
	
	public CameraDTO[] getCameraDTOs() {
		return cameraDTOs;
	}
	
	public abstract boolean save(CameraDTO dto);
	
	public abstract CameraDTO findById(int id);
	
	public abstract CameraDTO findByMaxCost();
	
	public abstract CameraDTO findByMinCost();
}
