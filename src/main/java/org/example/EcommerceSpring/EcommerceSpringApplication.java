package org.example.EcommerceSpring;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
<<<<<<< HEAD

=======
>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EcommerceSpringApplication {
	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().load();
		dotenv.entries().forEach(e -> System.setProperty(e.getKey(), e.getValue()));
		System.getProperty("PORT");
		SpringApplication.run(EcommerceSpringApplication.class, args);
	}
}

<<<<<<< HEAD
//39:52
=======
//1:27:49
>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
