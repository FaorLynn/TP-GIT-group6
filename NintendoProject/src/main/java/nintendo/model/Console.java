package nintendo.model;

import java.time.LocalDateTime;

public class Console {

	private String nom;
	private double prix;
	private LocalDateTime date_de_sortie;

	public Console(String nom, double prix, LocalDateTime date_de_sortie) {
		this.nom = nom;
		this.prix = prix;
		this.date_de_sortie = date_de_sortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public LocalDateTime getDate_de_sortie() {
		return date_de_sortie;
	}

	public void setDate_de_sortie(LocalDateTime date_de_sortie) {
		this.date_de_sortie = date_de_sortie;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", date_de_sortie=" + date_de_sortie + "]";
	}
	
}
