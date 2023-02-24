package ma.ismo.crjj.models;

import java.time.LocalDateTime;

public class Vol {

	private int id;
	private LocalDateTime hr_decallage;
	private Pilote pilote;
	private Avion avion;
	private Trajet trajet;

	public Vol() {
		super();
	}

	public Vol(int id, LocalDateTime hr_decallage) {
		super();
		this.id = id;
		this.hr_decallage = hr_decallage;
	}

	public Vol(int id, LocalDateTime hr_decallage, Pilote pilote, Avion avion, Trajet trajet) {
		super();
		this.id = id;
		this.hr_decallage = hr_decallage;
		this.pilote = pilote;
		this.avion = avion;
		this.trajet = trajet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getHr_decallage() {
		return hr_decallage;
	}

	public void setHr_decallage(LocalDateTime hr_decallage) {
		this.hr_decallage = hr_decallage;
	}

	public Pilote getPilote() {
		return pilote;
	}

	public void setPilote(Pilote pilote) {
		this.pilote = pilote;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Trajet getTrajet() {
		return trajet;
	}

	public void setTrajet(Trajet trajet) {
		this.trajet = trajet;
	}

}
