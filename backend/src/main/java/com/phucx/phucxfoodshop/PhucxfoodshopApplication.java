package com.phucx.phucxfoodshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.phucx.phucxfoodshop.repository")
@EntityScan("com.phucx.phucxfoodshop.model.entity")
public class PhucxfoodshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhucxfoodshopApplication.class, args);
	}

}
