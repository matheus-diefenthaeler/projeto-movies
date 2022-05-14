package com.matheus.projetomovies.services;

import com.matheus.projetomovies.dto.MovieDTO;
import com.matheus.projetomovies.entities.Movie;
import com.matheus.projetomovies.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Transactional
    public Page<MovieDTO> findAllPaged(Pageable pageable) {
        Page<Movie> result = repository.findAll(pageable);
        return result.map(MovieDTO::new);
    }

    public MovieDTO findById(Long id) {
        return new MovieDTO(repository.findById(id).get());
    }
}
