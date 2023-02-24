package ma.ismo.crjj.metier;

import java.util.List;

import ma.ismo.crjj.models.Pilote;

public class MetierPilote implements IMetier<Pilote> {

	IMetier<Pilote> mpilote = new MetierPilote();
	
	@Override
	public List<Pilote> getAll() {
		// TODO Auto-generated method stub
		return mpilote.getAll();
	}

	@Override
	public Pilote getOne(int id) {
		// TODO Auto-generated method stub
		return mpilote.getOne(id);
	}

	@Override
	public boolean create(Pilote obj) {
		// TODO Auto-generated method stub
		return mpilote.create(obj);
	}

	@Override
	public boolean update(Pilote obj) {
		// TODO Auto-generated method stub
		return mpilote.update(obj);
	}

	@Override
	public boolean delete(Pilote obj) {
		// TODO Auto-generated method stub
		return mpilote.delete(obj);
	}

	
}
