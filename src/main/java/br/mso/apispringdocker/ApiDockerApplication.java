package br.mso.apispringdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "br.mso.apispringdocker.model")
@SpringBootApplication(scanBasePackages = "br.mso.apispringdocker")
public class ApiDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDockerApplication.class, args);
	}

}
