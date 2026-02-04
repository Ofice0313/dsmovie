package com.devcaleb.dsmovie.controllers;

import com.devcaleb.dsmovie.dto.MovieDTO;
import com.devcaleb.dsmovie.dto.ScoreDTO;
import com.devcaleb.dsmovie.services.MovieService;
import com.devcaleb.dsmovie.services.ScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/scores")
public class ScoreController {

    @Autowired
    private ScoresService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
       MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }

}
