package com.devcaleb.dsmovie.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ScoreDTO {

    private Long movieId;
    private String email;
    private Double score;


}
