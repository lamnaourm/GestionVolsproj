package ma.ismo.crjj.metier;

import java.util.List;

import ma.ismo.crjj.models.Pilote;
import ma.ismo.crjj.models.Vol;

public class MetierVol implements IMetier<Vol> {

	IMetier<Vol> mvol = new MetierVol();
	
	@Override
	public List<Vol> getAll() {
		// TODO Auto-generated method stub
		return mvol.getAll();
	}

	@Override
	public Vol getOne(int id) {
		// TODO Auto-generated method stub
		return mvol.getOne(id);
	}

	@Override
	public boolean create(Vol obj) {
		// TODO Auto-generated method stub
		return mvol.create(obj);
	}

	@Override
	public boolean update(Vol obj) {
		// TODO Auto-generated method stub
		return mvol.update(obj);
	}

	@Override
	public boolean delete(Vol obj) {
		// TODO Auto-generated method stub
		return mvol.delete(obj);
	}


}
