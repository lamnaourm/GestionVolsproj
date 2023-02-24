package ma.ismo.crjj.models;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Trajet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "aeroport_depart")
	private String ao_depart;
	
	@Column(name = "aeroport_arrive")
	private String ao_arrivee;
	
	@Column
	private LocalDateTime duree;
	
	@OneToMany(mappedBy="trajet", fetch=FetchType.LAZY)
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
