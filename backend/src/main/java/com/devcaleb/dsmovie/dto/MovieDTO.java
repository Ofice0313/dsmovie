package com.devcaleb.dsmovie.dto;

import com.devcaleb.dsmovie.entities.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieDTO {

    private Long id;
    private String title;
    private Double score;
    private Integer count;
    private String image;

    public MovieDTO(Movie entity){
        id = entity.getId();
        title = entity.getTitle();
        score = entity.getScore();
        count = entity.getCount();
        image = entity.getImage();
    }
}
