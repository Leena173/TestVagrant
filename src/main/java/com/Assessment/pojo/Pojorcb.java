package com.Assessment.pojo;
/*
 * This pojo class will use to deserialize player list
 */

public class Pojorcb {
	
	String name;
	String location;
	playerDetails[] player;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public playerDetails[] getPlayer() {
		return player;
	}
	public void setPlayer(playerDetails[] player) {
		this.player = player;
	}
	
	public Pojorcb(String name, String location, playerDetails[] player) {
		super();
		this.name = name;
		this.location = location;
		this.player = player;
	}
	public Pojorcb() {
		
	}
	

}
