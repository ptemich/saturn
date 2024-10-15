package pl.ptemich.templates_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class TemplatesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplatesDemoApplication.class, args);
	}

}
