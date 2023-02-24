package ma.ismo.crjj.models;

import java.time.LocalDateTime;
import java.util.List;

public class Trajet {

	private int id;
	private String ao_depart;
	private String ao_arrivee;
	private LocalDateTime duree;
	private List<Vol> vols;

	public Trajet() {
		super();
	}

	public Trajet(int id, String ao_depart, String ao_arrivee, LocalDateTime duree) {
		super();
		this.id = id;
		this.ao_depart = ao_depart;
		this.ao_arrivee = ao_arrivee;
		this.duree = duree;
	}

	public Trajet(int id, String ao_depart, String ao_arrivee, LocalDateTime duree, List<Vol> vols) {
		super();
		this.id = id;
		this.ao_depart = ao_depart;
		this.ao_arrivee = ao_arrivee;
		this.duree = duree;
		this.vols = vols;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAo_depart() {
		return ao_depart;
	}

	public void setAo_depart(String ao_depart) {
		this.ao_depart = ao_depart;
	}

	public String getAo_arrivee() {
		return ao_arrivee;
	}

	public void setAo_arrivee(String ao_arrivee) {
		this.ao_arrivee = ao_arrivee;
	}

	public LocalDateTime getDuree() {
		return duree;
	}

	public void setDuree(LocalDateTime duree) {
		this.duree = duree;
	}

	public List<Vol> getVols() {
		return vols;
	}

	public void setVols(List<Vol> vols) {
		this.vols = vols;
	}

}
