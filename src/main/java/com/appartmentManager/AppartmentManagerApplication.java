package com.appartmentManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
@ComponentScan(basePackages = {"com.appartmentManager"})
public class AppartmentManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppartmentManagerApplication.class, args);
	}

}
