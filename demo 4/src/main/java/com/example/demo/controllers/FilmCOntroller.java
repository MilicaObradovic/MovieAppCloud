package com.example.demo.controllers;

import com.example.demo.model.Movie;
import com.example.demo.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/films")
@ComponentScan(basePackageClasses = FilmService.class)
public class FilmCOntroller {

    @Autowired
    private FilmService exampleService;

    @PostMapping()
    public ResponseEntity<Movie> createFilm(@RequestBody Movie exampleEntity) {
        exampleService.saveExample(exampleEntity);
        return new ResponseEntity<Movie>(exampleEntity, HttpStatus.CREATED);
    }
    @GetMapping()
    public ResponseEntity<Collection<Movie>> getFilms(@RequestBody Movie exampleEntity) {
        Collection<Movie> films = exampleService.findAll();
        return new ResponseEntity<Collection<Movie>>(films, HttpStatus.OK);
    }
}
