package com.stackroute;
import org.springframework.beans.factory.annotation.Autowired;
public class Movie {
    @Autowired
    Actor actor;
    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }
}