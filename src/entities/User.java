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
