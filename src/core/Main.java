package core;

import java.sql.Connection;

import entities.Droits;
import entities.User;

import javajackson.javajackson.json.manager.JsonManager;

public class Main {

	public static void main(String[] args) {

		User jack = new User();
		User ricky = new User();
		jack.setLogin("Jack");
		jack.setMot_de_passe("toto");
		ricky.setLogin("Ricky");
		ricky.setMot_de_passe("tata");
		Droits droits1 = new Droits();
		Droits droits2 = new Droits();
		droits1.setNiveau("Niveau 1");
		droits1.setNom("Droits N�1");
		droits1.setSeverite("Danger");
		droits1.setSociete("Ubisoft");
		droits2.setNiveau("Niveau 2");
		droits2.setNom("Droits N�2");
		droits2.setSeverite("Normal");
		droits2.setSociete("Ubisoft");
		
		ricky.droits.add(droits1);
		ricky.droits.add(droits2);		
		
		JsonManager json = JsonManager.getInstance();
		
		json.addItem(ricky);
		json.addItem(jack);
		json.sendToFile();

	}
}
