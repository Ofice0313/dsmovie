package com.devcaleb.dsmovie.repositories;

import com.devcaleb.dsmovie.entities.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}
