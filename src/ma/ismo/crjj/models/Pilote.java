package ma.ismo.crjj.models;

import java.util.List;

public class Pilote {

	private int id;
	private String nom;
	private String prenom;
	private List<Vol> vols;

	public Pilote() {
		super();
	}

	public Pilote(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Pilote(int id, String nom, String prenom, List<Vol> vols) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.vols = vols;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Vol> getVols() {
		return vols;
	}

	public void setVols(List<Vol> vols) {
		this.vols = vols;
	}

}
