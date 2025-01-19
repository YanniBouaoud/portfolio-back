package fr.yanni.portfolio2025;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "fr.yanni.portfolio2025")

public class Portfolio2025Application {

	public static void main(String[] args) {
		SpringApplication.run(Portfolio2025Application.class, args);
	}

}
