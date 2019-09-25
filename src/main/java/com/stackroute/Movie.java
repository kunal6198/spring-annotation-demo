package com.stackroute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    Actor actor;

    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
    }
    public Movie(){}

    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }
}