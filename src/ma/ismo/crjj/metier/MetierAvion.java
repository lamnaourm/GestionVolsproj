package ma.ismo.crjj.metier;

import java.util.List;

import ma.ismo.crjj.models.Avion;

public class MetierAvion implements IMetier<Avion> {

	IMetier<Avion> mavion = new MetierAvion();
	
	@Override
	public List<Avion> getAll() {
		// TODO Auto-generated method stub
		return mavion.getAll();
	}

	@Override
	public Avion getOne(int id) {
		// TODO Auto-generated method stub
		return mavion.getOne(id);
	}

	@Override
	public boolean create(Avion obj) {
		// TODO Auto-generated method stub
		return mavion.create(obj);
	}

	@Override
	public boolean update(Avion obj) {
		// TODO Auto-generated method stub
		return mavion.update(obj);
	}

	@Override
	public boolean delete(Avion obj) {
		// TODO Auto-generated method stub
		return mavion.delete(obj);
	}

}
