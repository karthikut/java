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
	
	
	public void saveMultiple(IplTeamDTO dto1, IplTeamDTO dto2) {
		if(dto1!=null) {
			this.saveTeam(dto1);
		}
		else {
			System.out.println("first team which represents null so cant save it");
		}
		if(dto2!=null) {
			this.saveTeam(dto2);
		}
		else {
			System.out.println("second team which represents null so cant save it");
	}
		
		
		
		
		
	}

	public void updateSponsorByName(String name, String Sponsor) {
		// TODO Auto-generated method stub
		if(name==null && Sponsor==null) {
			System.out.println("not passing the value");
			return;
		}
		IplTeamDTO teamfound= this.findByName(name);
		teamfound.setSponsor(Sponsor);
	}
		
		public void updateCaptainByName(String name, String captain) {
			// TODO Auto-generated method stub
			if(name==null && captain==null) {
				System.out.println("not passing the value");
				return;
			}
			IplTeamDTO teamfound= this.findByName(name);
			teamfound.setCaptainName(captain);;
		
		
	}
}

	

