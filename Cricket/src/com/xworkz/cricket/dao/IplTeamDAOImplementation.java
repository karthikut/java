package com.xworkz.cricket.dao;

import com.xworkz.cricket.dto.IplTeamDTO;

public class IplTeamDAOImplementation extends IplTeamDAO {

	public IplTeamDAOImplementation() {
		System.out.println("created" + getClass().getSimpleName());
	}
	
	
	
	
	public void saveTeam(IplTeamDTO teamDTOs) {
	super.saveTeam(teamDTOs);
	
	}
	
	public IplTeamDTO findByName(String name) {
		if(name==null) {
			System.out.println("no name is passed");
			return null;
		}
		for (int index=0;index <teamDTOs.length;index++) {
			if (super.teamDTOs[index].getTeamName().equals(name));
			return super.teamDTOs[index];
		}
		System.out.println("team name is not found");
		return null;
		}
	
	

	
	public IplTeamDTO findByNameAndSponsor(String name, String Sponsor) {
		if(name==null && Sponsor==null) {
			System.err.println("no name is passed, not able to get info" );
			return null;
		}
		for (int index=0;index <teamDTOs.length;index++) {
			if (super.teamDTOs[index].getTeamName().equals(name) && teamDTOs[index].getSponsor().equals(Sponsor)) ;
			return super.teamDTOs[index];
	}
		System.out.println("name and sponsor passedis not found");
		return null;
	}
	

	public IplTeamDTO findByNameAndSponsorAndCapatain(String name, String Sponsor, String Captain) {
		if(name==null && Sponsor==null && Captain==null) {
			System.err.println("no name is passed, not able to get info" );
			return null;
		}
		for (int index=0;index <teamDTOs.length;index++) {
			if (super.teamDTOs[index].getTeamName().equals(name) && teamDTOs[index].getSponsor().equals(Sponsor) && teamDTOs[index].getCaptainName().equals(Captain)) ;
			return super.teamDTOs[index];
	}
		System.out.println("name and sponsor passedis not found");
		return null;
		
	}
}

	

