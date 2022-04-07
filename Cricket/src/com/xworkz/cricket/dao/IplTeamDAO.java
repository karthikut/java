package com.xworkz.cricket.dao;

import com.xworkz.cricket.dto.IplTeamDTO;

public abstract class IplTeamDAO {
	
	IplTeamDTO[] teamDTOs=new IplTeamDTO[14];
	int arraysize=0;

	public IplTeamDAO() {
		System.out.println("creating" + getClass().getSimpleName());
	}

	
	public void saveTeam(IplTeamDTO teamDTOs) {
	        if (teamDTOs==null) {
			System.out.println("passing instance is empty");
		}
		if(arraysize<this.teamDTOs.length) {
			System.out.println("create team into the array");
			this.teamDTOs[arraysize]=teamDTOs;
			arraysize++;
		}
		
	}
}
