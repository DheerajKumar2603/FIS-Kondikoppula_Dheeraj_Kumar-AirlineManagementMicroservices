package com.example.airlinemanageadmin.model;

public class PassengerDto {
	

	
	int profile_id;
	
	 String password ;
	
	 String airline;
	 
	 PassengerDto(){}

	 public PassengerDto(int profile_id, String password, String airline) {
		super();
		this.profile_id = profile_id;
		this.password = password;
		this.airline = airline;
	}

	public int getProfile_id() {
		return profile_id;
	}
	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}


}
