package com.jbk.Alpha;

public class IPL {
	private String Team;
	private String Captain;
	private String Jersy_Colour;
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	public String getCaptain() {
		return Captain;
	}
	public void setCaptain(String captain) {
		Captain = captain;
	}
	public String getJersy_Colour() {
		return Jersy_Colour;
	}
	public void setJersy_Colour(String jersy_Colour) {
		Jersy_Colour = jersy_Colour;
	}
	@Override
	public String toString() {
		return "IPL [Team=" + Team + ", Captain=" + Captain + ", Jersy_Colour=" + Jersy_Colour + "]";
	}
	
	
}
