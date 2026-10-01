package nintendo.model;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private List<Achat> achats = new ArrayList<>();
	
	
	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public List<Achat> getAchats() {
		return achats;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setAchats(List<Achat> achats) {
		this.achats = achats;
	}
	
}