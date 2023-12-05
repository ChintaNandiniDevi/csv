package com.example.ch.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@ComponentScan("com.example.ch.cg.")
@EntityScan("com.example.ch.cg.entity")
@EnableJpaRepositories(basePackages = "com.example.ch.cg.repository")
@SpringBootApplication
public class CgApplication {

	public static void main(String[] args) {
		SpringApplication.run(CgApplication.class, args);
	}

}
