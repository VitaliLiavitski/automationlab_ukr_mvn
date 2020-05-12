package com.solvd.animal;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.solvd.utils.JsonExec;

public class Executor {

	private final static Logger LOGGER = Logger.getLogger(Executor.class);
	
	public static void main(String[] args) {
		
		
		Place place = new Place();
		place.setTitle("World");
		
		Place place1 = new Place();
		place1.setTitle("Europe");
		
		Place place2 = new Place();
		place2.setTitle("Asia");
		
		Animal animal = new Animal();
		animal.setId(13213);
		animal.setName("Rex");
		animal.getName();
		animal.setPlace(place);
		
		
		Animal animal1 = new Animal();
		animal1.setId(14324);
		animal1.setName("Rex1");
		animal1.getName();
		animal1.setPlace(place1);
		
		Animal animal2 = new Animal();
		animal2.setId(15435);
		animal2.setName("Rex2");
		animal2.getName();
		animal2.setPlace(place2);
		
		
		
		List<Animal> animals = new ArrayList<Animal>();
		
		animals.add(animal);
		animals.add(animal1);
		animals.add(animal2);
		
		
		LOGGER.info(animal.getId());
		LOGGER.info("=============");
		
		
		JsonExec jsonAction = new JsonExec();
		
		String jsonSrt = jsonAction.convertJavaToJsonStr(animal);
		
		LOGGER.info(jsonSrt);
		LOGGER.info("================");
		jsonAction.convertJavaToJsonFile(animal, "animal.json");
		
		jsonAction.convertJavaToJsonFile(animals, "animals.json");
		
		
		String jsonStr1 = "{\"name\":\"Jack\",\"id\":90987,\"place\":{\"title\":\"North America\"}}";
		
		Animal animal4 = jsonAction.convertJsonStrToAnimalPOJO(jsonStr1);
		
		LOGGER.info("Name from POJO: " + animal4.getName());
		LOGGER.info("Name place from POJO: " + animal4.getPlace().getTitle());
		
	}

}
