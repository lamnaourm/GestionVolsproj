package ma.ismo.crjj.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Vol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="date_decollage")
	private LocalDateTime hr_decallage;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_pilote")
	private Pilote pilote;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_avion")
	private Avion avion;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_trajet")
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
