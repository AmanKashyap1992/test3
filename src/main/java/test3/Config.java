package test3;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScans(value = { 
		 @ComponentScan("boot.entry"), 
		 @ComponentScan("test3"),
		 @ComponentScan("test3.service"),
		 @ComponentScan("test3.dao")
		})
public class Config {

}