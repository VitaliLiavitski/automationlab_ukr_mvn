package com.solvd.animal;

import org.apache.log4j.Logger;

public class Animal {
	
	private final static Logger LOGGER = Logger.getLogger(Animal.class);
	
	private String name;
	private int id;
	
	
	public String getName() {
		LOGGER.info(this.name);
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		LOGGER.debug(this.name);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
}
