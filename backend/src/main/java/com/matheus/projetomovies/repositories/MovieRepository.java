package com.matheus.projetomovies.repositories;

import com.matheus.projetomovies.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
