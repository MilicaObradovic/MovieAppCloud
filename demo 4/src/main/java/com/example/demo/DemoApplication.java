package com.example.demo;

import com.example.demo.controllers.FilmCOntroller;
import com.example.demo.model.Movie;
import com.example.demo.repos.FilmRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackageClasses = {Movie.class})
@EnableJpaRepositories(basePackageClasses = {FilmRepo.class})
@ComponentScan(basePackageClasses = {FilmCOntroller.class})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
