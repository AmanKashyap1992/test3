package test3.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Repository;


import test3.HibernateUtil;
import test3.User;

@Repository  
public class DaoImpl implements Dao {
	private static Session session;
	String message = "failed";
	@Override
	public String saveData(User user) {

	try {
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		  Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		 SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		session = factory.openSession();//HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(user);
		message = "success";
		session.getTransaction().commit();
	}catch(HibernateException exception){
	     System.out.println("Problem creating session factory");
	     exception.printStackTrace();
	}catch (Exception e) {
		if(null != session.getTransaction()) {
			System.out.println("\n.......Transaction Is Being Rolled Back.......");
			session.getTransaction().rollback();
		}
		message = "failed";
	}finally {
		if(session != null) {
			session.close();
		}
	}
		return message;
	}

}
