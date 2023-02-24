package ma.ismo.crjj.models;

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
public class Avion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String compagnie;
	
	@Column
	private String type;
	
	@OneToMany(mappedBy="avion", fetch=FetchType.LAZY)
	private List<Vol> vols;

	public Avion() {
		super();
	}

	public Avion(int id, String compagnie, String type) {
		super();
		this.id = id;
		this.compagnie = compagnie;
		this.type = type;
	}

	public Avion(int id, String compagnie, String type, List<Vol> vols) {
		super();
		this.id = id;
		this.compagnie = compagnie;
		this.type = type;
		this.vols = vols;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Vol> getVols() {
		return vols;
	}

	public void setVols(List<Vol> vols) {
		this.vols = vols;
	}
}
