package ma.ismo.crjj.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import ma.ismo.crjj.models.Avion;
import ma.ismo.crjj.models.Pilote;
import ma.ismo.crjj.models.Trajet;
import ma.ismo.crjj.models.Vol;

public class HibernateUtils {
	
	private static final SessionFactory sessionFactory;
	private static final ServiceRegistry serviceRegistry;
	
	static {
		Configuration config = new Configuration();
		config.configure();
		
		config.addAnnotatedClass(Avion.class);
		config.addAnnotatedClass(Pilote.class);
		config.addAnnotatedClass(Trajet.class);
		config.addAnnotatedClass(Vol.class);
		
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sessionFactory = config.buildSessionFactory(serviceRegistry);
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
}
