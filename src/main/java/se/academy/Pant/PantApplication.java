package se.academy.Pant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class PantApplication {

	public static void main(String[] args) {
		SpringApplication.run(PantApplication.class, args);
	}

}

