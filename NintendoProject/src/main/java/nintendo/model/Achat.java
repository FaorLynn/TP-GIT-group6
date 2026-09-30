package nintendo.model;

public class Achat {
	private Jeu jeu;
	private String date;
	private int prix;
	
	public Achat(Jeu jeu, String date, int prix) {
		super();
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
	}

	public Jeu getJeu() {
		return jeu;
	}

	public String getDate() {
		return date;
	}

	public int getPrix() {
		return prix;
	}

	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	

}
