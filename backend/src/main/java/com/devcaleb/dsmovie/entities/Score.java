package com.devcaleb.dsmovie.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_score")
@NoArgsConstructor
public class Score {

    @EmbeddedId
    private ScorePK id = new ScorePK();
    @Column(name = "valor")
    private Double value;

    public void setMovie(Movie movie) {
        id.setMovie(movie);
    }

    public Movie getMovie() {
        return id.getMovie();
    }

    public void setUser(User user) {
        id.setUser(user);
    }

    public User getUser() {
        return id.getUser();
    }

    public ScorePK getId() {
        return id;
    }

    public void setId(ScorePK id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
