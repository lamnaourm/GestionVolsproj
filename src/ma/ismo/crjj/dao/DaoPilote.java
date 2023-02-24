package ma.ismo.crjj.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ma.ismo.crjj.models.Pilote;
import ma.ismo.crjj.utils.HibernateUtils;

public class DaoPilote implements IDao<Pilote> {

	@Override
	public List<Pilote> getAll() {
		Session s = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		List<Pilote> pilotes = s.createQuery("from Pilote").getResultList();
		t.commit();
		s.close();
		return pilotes;
	}

	@Override
	public Pilote getOne(int id) {
		Session s = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		return s.get(Pilote.class, id);
	}

	@Override
	public boolean create(Pilote obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Pilote obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Pilote obj) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
