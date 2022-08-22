package br.com.letscode.aula3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Aula3Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Aula3Application.class, args);
	}

}
