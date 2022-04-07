package com.xworkz.cricket.dto;

public class IplTeamDTO {

		private String teamId;
		private String teamName;
		private String captainName;
		private int noofWins;
		private int noofLostMATCH;
		private String sponsor;
		
		
		public String getSponsor() {
			return sponsor;
		}


		public void setSponsor(String sponsor) {
			this.sponsor = sponsor;
		}


		public IplTeamDTO() {
			
		System.out.println("create" + getClass().getSimpleName());
	}


		public String getTeamId() {
			return teamId;
		}


		public void setTeamId(String teamId) {
			this.teamId = teamId;
		}


		public String getTeamName() {
			return teamName;
		}


		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}


		public String getCaptainName() {
			return captainName;
		}


		public void setCaptainName(String captainName) {
			this.captainName = captainName;
		}


		public int getNoofWins() {
			return noofWins;
		}


		public void setNoofWins1(int noofWins) {
			this.noofWins = noofWins;
			
		}


		public int getNoofLostMATCH() {
			return noofLostMATCH;
		}


		public void setNoofLostMATCH(int noofLostMATCH) {
			this.noofLostMATCH = noofLostMATCH;
		}


		public void setNoofWins(int noofWins2) {
			// TODO Auto-generated method stub
			
		}


		public void setNoofLostMATCH1(int noofLostMATCH2) {
			// TODO Auto-generated method stub
			
		}


		
		
}
