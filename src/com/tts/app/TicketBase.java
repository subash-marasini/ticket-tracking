package com.tts.app;

public class TicketBase {
	
	private int id;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//special purpose methods
	//This method prints the particular ticket information. Very simple method no return and parameters.
	public void printTicketInformation() {
		System.out.println(id+" "+type);
	}

}
