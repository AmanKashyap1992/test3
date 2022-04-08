package test3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Test3MainApplication extends SpringBootServletInitializer  implements ApplicationRunner {
	private static final Logger logger = LogManager.getLogger(Test3MainApplication.class);

	public static void main(String[] args) {  
        SpringApplication.run(Test3MainApplication.class, args);		
    }  
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	return application.sources(Test3MainApplication.class);
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}


