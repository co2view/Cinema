package project.cinema.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class CinemaBootWebApplication extends SpringBootServletInitializer {

	private final static Object[] CONFIGS = { 
			SpringCinemaConfig.class 
			};

	public static void main(final String... args) {
		final SpringApplication springApplication = new SpringApplication(CONFIGS);
		springApplication.run(args);
	}

}