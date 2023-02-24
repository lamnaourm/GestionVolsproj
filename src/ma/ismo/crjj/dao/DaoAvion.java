package ma.ismo.crjj.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ma.ismo.crjj.models.Avion;
import ma.ismo.crjj.utils.HibernateUtils;

public class DaoAvion implements IDao<Avion> {

	@Override
	public List<Avion> getAll() {
		Session s = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		List<Avion> avions = s.createQuery("from Avion").getResultList();
		t.commit();
		s.close();
		return avions;
	}

	@Override
	public Avion getOne(int id) {
		Session s = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		return s.get(Avion.class, id);
	}

	@Override
	public boolean create(Avion obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Avion obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Avion obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
