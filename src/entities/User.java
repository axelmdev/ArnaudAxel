/**
 * 
 */
package entities;

import java.util.ArrayList;

/**
 * @author Axel
 *
 */
public class User {
	public String nom;
	public String prenom;
	public String login;
	public String mot_de_passe;
        
        public User(){
            ArrayList droits = new ArrayList();
        }
	
	public User() {
		
	}
	public User(String nom, String prenom, String login, String mot_de_passe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mot_de_passe = mot_de_passe;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	
}
