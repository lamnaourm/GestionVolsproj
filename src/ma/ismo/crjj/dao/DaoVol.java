package ma.ismo.crjj.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ma.ismo.crjj.models.Avion;
import ma.ismo.crjj.models.Vol;
import ma.ismo.crjj.utils.HibernateUtils;

public class DaoVol implements IDao<Vol> {

	@Override
	public List<Vol> getAll() {
		Session s = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		List<Vol> vols = s.createQuery("from Vol").getResultList();
		t.commit();
		s.close();
		return vols;
	}

	@Override
	public Vol getOne(int id) {
		Session s = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		return s.get(Vol.class, id);
	}

	@Override
	public boolean create(Vol obj) {
		return false;
	}

	@Override
	public boolean update(Vol obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Vol obj) {
		// TODO Auto-generated method stub
		return false;
	}


}
