package com.solvd.animal;

import org.apache.log4j.Logger;

public class Animal {
	
	private final static Logger LOGGER = Logger.getLogger(Animal.class);
	
	private String name;
	private int id;
	private Place place;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}
	
}
