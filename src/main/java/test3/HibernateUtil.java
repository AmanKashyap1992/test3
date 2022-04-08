package test3;



import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		 if (sessionFactory == null) {
	            // loads configuration and mappings
	           
				/*
				 * Properties settings = new Properties(); settings.put(Environment.DRIVER,
				 * "com.mysql.jdbc.Driver"); settings.put(Environment.URL,
				 * "jdbc:mysql://localhost:3306/tutorialdb"); settings.put(Environment.USER ,
				 * "root"); settings.put(Environment.PASS , "root");
				 * settings.put(Environment.DIALECT , "org.hibernate.dialect.MySQLDialect");
				 * settings.put(Environment.SHOW_SQL , "true"); Configuration configuration =
				 * new Configuration().configure(); configuration.setProperties(settings);
				 * configuration.addAnnotatedClass(User.class); ServiceRegistry serviceRegistry
				 * = new StandardServiceRegistryBuilder()
				 * .applySettings(configuration.getProperties()).build();
				 */
	             
	            // builds a session factory from the service registry
	           // sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
			    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
			    sessionFactory= meta.getSessionFactoryBuilder().build();  
	        }
	         
	        return sessionFactory;
	}
}
