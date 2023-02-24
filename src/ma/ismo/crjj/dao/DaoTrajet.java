package ma.ismo.crjj.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ma.ismo.crjj.models.Trajet;
import ma.ismo.crjj.utils.HibernateUtils;

public class DaoTrajet implements IDao<Trajet> {

	@Override
	public List<Trajet> getAll() {
		Session s = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		List<Trajet> trajets = s.createQuery("from Trajet").getResultList();
		t.commit();
		s.close();
		return trajets;
	}

	@Override
	public Trajet getOne(int id) {
		Session s = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		return s.get(Trajet.class, id);
	}

	@Override
	public boolean create(Trajet obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Trajet obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Trajet obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
