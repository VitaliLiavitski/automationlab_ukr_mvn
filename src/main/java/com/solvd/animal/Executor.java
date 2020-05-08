package com.solvd.animal;

import org.apache.log4j.Logger;

public class Executor {

	private final static Logger LOGGER = Logger.getLogger(Executor.class);
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		
		animal.setId(1);
		animal.setName("Rex");
		
		animal.getName();
		
		LOGGER.info(animal.getId());
		
		LOGGER.error("");
		
		LOGGER.debug("");
		
	}

}
