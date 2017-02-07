package entities;

import javajackson.javajackson.json.manager.JsonManager;
import entities.Configuration;

public class ConfigurationManager {

	public static void main(String[] args) {
		JsonManager json = JsonManager.getInstance();		
		
			json.clear();
			Class Configuration = null;
			json.readFromFile("conf.prog", "/ArnaudAxel/conf.prog", Configuration);


	}

}
