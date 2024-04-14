package com.example.demo.services;

import com.example.demo.model.Movie;
import com.example.demo.repos.FilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FilmService {

    @Autowired
    private FilmRepo filmRepository;

    public Movie saveExample(Movie exampleEntity) {
        return filmRepository.save(exampleEntity);
    }
    public Collection<Movie> findAll() {
        return  filmRepository.findAll();
    }
}
