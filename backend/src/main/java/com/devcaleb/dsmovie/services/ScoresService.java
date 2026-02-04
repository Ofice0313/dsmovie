package com.devcaleb.dsmovie.services;

import com.devcaleb.dsmovie.dto.MovieDTO;
import com.devcaleb.dsmovie.dto.ScoreDTO;
import com.devcaleb.dsmovie.entities.Movie;
import com.devcaleb.dsmovie.entities.Score;
import com.devcaleb.dsmovie.entities.User;
import com.devcaleb.dsmovie.repositories.MovieRepository;
import com.devcaleb.dsmovie.repositories.ScoreRepository;
import com.devcaleb.dsmovie.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoresService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional
    public MovieDTO saveScore(ScoreDTO score) {

        User user = userRepository.findByEmail(score.getEmail());
        if(user == null) {
            user = new User();
            user.setEmail(score.getEmail());
            user = userRepository.saveAndFlush(user);
        }

        Movie movie = movieRepository.findById(score.getMovieId()).get();

        Score score1 = new Score();
        score1.setMovie(movie);
        score1.setUser(user);
        score1.setValue(score.getScore());

        score1 = scoreRepository.saveAndFlush(score1);

        double sum = 0.0;
        for(Score s: movie.getScores()) {
            sum = sum + s.getValue();
        }

        double avg = sum / movie.getScores().size();
        movie.setScore(avg);
        movie.setCount(movie.getScores().size());

        movie = movieRepository.save(movie);

        return new MovieDTO(movie);
    }


}
