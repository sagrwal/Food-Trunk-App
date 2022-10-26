package com.primesoft.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.primesoft","com.primesoft.repo.*","com.primesoft.dao.*"})
@EnableJpaRepositories(basePackages="com.primesoft.repo.*")
@SpringBootApplication
@EntityScan({"com.primesoft.entity.*"})
//@EnableAutoConfiguration
public class FoodTruckAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodTruckAppApplication.class, args);
	}

}
