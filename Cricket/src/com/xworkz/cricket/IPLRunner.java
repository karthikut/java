package com.xworkz.cricket;

import com.xworkz.cricket.dao.IplTeamDAO;
import com.xworkz.cricket.dao.IplTeamDAOImplementation;
import com.xworkz.cricket.dto.IplTeamDTO;

public class IPLRunner {

	public static void main(String[] args) {
		 
		IplTeamDTO team1= new IplTeamDTO();
		team1.setCaptainName("rohit");
		team1.setTeamName("mumbai indians");
		team1.setNoofLostMATCH(26);
		team1.setNoofWins(47);
		team1.setTeamId("MI");
		team1.setSponsor("idea");
		
		
		IplTeamDTO team2= new IplTeamDTO();
		team2.setCaptainName("jadeja");
		team2.setTeamName("Chennai super kings");
		team2.setNoofLostMATCH(38);
		team2.setNoofWins(64);
		team2.setTeamId("csk");
		team2.setSponsor("byjus");
		
		IplTeamDTO team3= new IplTeamDTO();
		team3.setCaptainName("faf du plesis");
		team3.setTeamName("royal challengers banglore");
		team3.setNoofLostMATCH(21);
		team3.setNoofWins(100);
		team3.setTeamId("rcb");
		team3.setSponsor("puma");
		
		IplTeamDTO team4= new IplTeamDTO();
		team4.setCaptainName("samson");
		team4.setTeamName("rajastan royals");
		team4.setNoofLostMATCH(15);
		team4.setNoofWins(74);
		team4.setTeamId("rr");
		team4.setSponsor("adidas");
		
		IplTeamDTO team5= new IplTeamDTO();
		team5.setCaptainName("kane");
		team5.setTeamName("sunrisers hyderabad");
		team5.setNoofLostMATCH(36);
		team5.setNoofWins(55);
		team5.setTeamId("srh");
		team5.setSponsor("voltas");
		
		IplTeamDTO team6= new IplTeamDTO();
		team6.setCaptainName("hardik");
		team6.setTeamName("gujrat titans");
		team6.setNoofLostMATCH(05);
		team6.setNoofWins(12);
		team6.setTeamId("gt");
		team6.setSponsor("whirlpool");
		
		IplTeamDTO team7= new IplTeamDTO();
		team7.setCaptainName("rahul");
		team7.setTeamName("lucknow super gaints");
		team7.setNoofLostMATCH(45);
		team7.setNoofWins(98);
		team7.setTeamId("lst");
		team7.setSponsor("LG");
		
		IplTeamDTO team8= new IplTeamDTO();
		team8.setCaptainName("mayank");
		team8.setTeamName("kings eleven punjab");
		team8.setNoofLostMATCH(15);
		team8.setNoofWins(82);
		team8.setTeamId("px1");
		team8.setSponsor("nikon");
		
		IplTeamDTO team9= new IplTeamDTO();
		team9.setCaptainName("rishab");
		team9.setTeamName("delhi capitals");
		team9.setNoofLostMATCH(45);
		team9.setNoofWins(75);
		team9.setTeamId("dc");
		team9.setSponsor("jsw");
		
		IplTeamDTO team10= new IplTeamDTO();
		team10.setCaptainName("shreyas");
		team10.setTeamName("kolkatta knight riders");
		team10.setNoofLostMATCH(13);
		team10.setNoofWins(58);
		team10.setTeamId("kkn");
		team10.setSponsor("tata");
		
		
		IplTeamDTO team11= new IplTeamDTO();
		
		team11.setCaptainName("Abd");
		team11.setTeamName("andra pradesh");
		team11.setNoofLostMATCH(14);
		team11.setNoofWins(25);
		team11.setTeamId("ap");
		team11.setSponsor("samsung");
		
		IplTeamDTO team12= new IplTeamDTO();
		team12.setCaptainName("karthik");
		team12.setTeamName("pune warriors");
		team12.setNoofLostMATCH(6);
		team12.setNoofWins(57);
		team12.setTeamId("pw");
		team12.setSponsor("sony");
		
		IplTeamDTO team13= new IplTeamDTO();
		team13.setCaptainName("brendon");
		team13.setTeamName("kerala kochi tuskers");
		team13.setNoofLostMATCH(24);
		team13.setNoofWins(89);
		team13.setTeamId("kct");
		team13.setSponsor("jio");
		
		IplTeamDTO team14= new IplTeamDTO();
		team14.setCaptainName("warner");
		team14.setTeamName("kashmir thunders");
		team14.setNoofLostMATCH(3);
		team14.setNoofWins(8);
		team14.setTeamId("kt");
		team14.setSponsor("aircel");
		
		IplTeamDAO teamDAO= new IplTeamDAOImplementation();
		teamDAO.saveTeam(team1);
		teamDAO.saveTeam(team2);
		teamDAO.saveTeam(team3);
		teamDAO.saveTeam(team4);
		teamDAO.saveTeam(team5);
		teamDAO.saveTeam(team6);
		teamDAO.saveTeam(team7);
		teamDAO.saveTeam(team8);
		teamDAO.saveTeam(team9);
		teamDAO.saveTeam(team10);
		teamDAO.saveTeam(team11);
		teamDAO.saveTeam(team12);
		teamDAO.saveTeam(team13);
		teamDAO.saveTeam(team14);
		
		IplTeamDAOImplementation castedteamDAO=(IplTeamDAOImplementation)teamDAO;
		IplTeamDTO check = castedteamDAO.findByName("mumbai indians");
		System.out.println(check.getTeamName());
		
		IplTeamDTO check1 = castedteamDAO.findByNameAndSponsor("mumbai indians","null");
		System.out.println(check1.getCaptainName());
		System.out.println(check1.getNoofLostMATCH());
		
		
		castedteamDAO.saveMultiple(team10, team12);
		 
		castedteamDAO.updateSponsorByName("mumbai indians", "tata");
		System.out.println(check.getSponsor());
		
		castedteamDAO.updateCaptainByName("mumbai indians", "dhoni");
		System.out.println(check.getCaptainName());


	}

}
