package com.matheus.projetomovies.services;

import com.matheus.projetomovies.dto.MovieDTO;
import com.matheus.projetomovies.dto.ScoreDTO;
import com.matheus.projetomovies.entities.Movie;
import com.matheus.projetomovies.entities.Score;
import com.matheus.projetomovies.entities.User;
import com.matheus.projetomovies.repositories.MovieRepository;
import com.matheus.projetomovies.repositories.ScoreRepository;
import com.matheus.projetomovies.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;


    @Transactional
    public MovieDTO saveScore(ScoreDTO dto) {
        User user = userRepository.findByEmail(dto.getEmail());
        if (user == null) {
            user = new User();
            user.setEmail(dto.getEmail());
            user = userRepository.saveAndFlush(user);
        }
        Movie movie = movieRepository.findById(dto.getMovieId()).get();

        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(dto.getScore());

        score = scoreRepository.saveAndFlush(score);

        double sum = 0.0;
        int count = movie.getScores().size();
        for (Score s : movie.getScores()) {
            sum += s.getValue();
        }

        double avg = sum / count;
        movie.setScore(avg);
        movie.setCount(count);

        movie = movieRepository.save(movie);
        return new MovieDTO(movie);
    }
}
