package core;

import java.sql.ResultSet;
import java.sql.Connection;

import entities.Droits;
import entities.User;
import jdbc.MySQLAccess;

import javajackson.javajackson.json.manager.JsonManager;

public class Main {

	public static void main(String[] args) {
		int users_id = 0;
		// Right 1
		try {
			MySQLAccess.getInstance().updateQuery("INSERT INTO rights (niveau,severite,nom,societe) "
				+ "VALUES('Niveau 1','Danger','Droit 1','Ubisoft')");
		} catch(Exception e) {
			e.printStackTrace();
		}
		// Right 2
		try {
			MySQLAccess.getInstance().updateQuery("INSERT INTO rights (niveau,severite,nom,societe) "
				+ "VALUES('Niveau 2','Normal','Droit 2','Ubisoft')");
		} catch(Exception e) {
			e.printStackTrace();
		}
		// User 1
		try {
			MySQLAccess.getInstance().updateQuery("INSERT INTO users (login,password,nom,prenom) "
				+ "VALUES('Jack','toto','Jack','Lee')");
			
			ResultSet result_id = MySQLAccess.getInstance().resultQuery("SELECT LAST_INSERT_ID() As id FROM users");
			while (result_id.next()) {
				users_id = result_id.getInt("id");
			}
			MySQLAccess.getInstance().updateQuery("INSERT INTO users_droits (users_id,droits_id) "
					+ "VALUES("+ users_id +",1)");
			MySQLAccess.getInstance().updateQuery("INSERT INTO users_droits (users_id,droits_id) "
					+ "VALUES("+ users_id +",2)");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		// User 2
		try {
			MySQLAccess.getInstance().updateQuery("INSERT INTO users (login,password,nom,prenom) "
				+ "VALUES('Ricky','tata','Ricky','Bobby')");
			ResultSet result_id = MySQLAccess.getInstance().resultQuery("SELECT LAST_INSERT_ID() As id FROM users");
			while (result_id.next()) {
				users_id = result_id.getInt("id");
			}
			MySQLAccess.getInstance().updateQuery("INSERT INTO users_droits (users_id,droits_id) "
					+ "VALUES("+ users_id +",1)");
			MySQLAccess.getInstance().updateQuery("INSERT INTO users_droits (users_id,droits_id) "
					+ "VALUES("+ users_id +",2)");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
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
