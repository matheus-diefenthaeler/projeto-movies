package com.matheus.projetomovies.repositories;

import com.matheus.projetomovies.entities.Score;
import com.matheus.projetomovies.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
