package com.devcaleb.dsmovie.repositories;

import com.devcaleb.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
