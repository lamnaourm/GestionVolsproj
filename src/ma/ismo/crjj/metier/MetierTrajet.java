package ma.ismo.crjj.metier;

import java.util.List;

import ma.ismo.crjj.models.Pilote;
import ma.ismo.crjj.models.Trajet;

public class MetierTrajet implements IMetier<Trajet> {

	IMetier<Trajet> mtrajet = new MetierTrajet();
	
	@Override
	public List<Trajet> getAll() {
		// TODO Auto-generated method stub
		return mtrajet.getAll();
	}

	@Override
	public Trajet getOne(int id) {
		// TODO Auto-generated method stub
		return mtrajet.getOne(id);
	}

	@Override
	public boolean create(Trajet obj) {
		// TODO Auto-generated method stub
		return mtrajet.create(obj);
	}

	@Override
	public boolean update(Trajet obj) {
		// TODO Auto-generated method stub
		return mtrajet.update(obj);
	}

	@Override
	public boolean delete(Trajet obj) {
		// TODO Auto-generated method stub
		return mtrajet.delete(obj);
	}

}
