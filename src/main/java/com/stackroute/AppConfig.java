package com.stackroute;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    @Bean
    public Actor getactor1()
    {
        Actor actor1 = new Actor("Amitabh","Male",70);
        //actor.setName("Amitabh Bachchan");
        //actor.setGender("Male");
        //actor.setAge(70);
        return actor1;
    }
    @Bean
    public Actor getactor2()
    {
        Actor actor2 = new Actor("SRK","Male",50);
        //actor.setName("Amitabh Bachchan");
        //actor.setGender("Male");
        //actor.setAge(70);
        return actor2;
    }
    @Bean(value="movie1")
    public Movie getmovie1()
    {
        Movie movie1 = new Movie(getactor1());
        return movie1;
    }


    @Bean(value="movie2")
    public Movie getmovie2()
    {
        Movie movie2 = new Movie(getactor2());
        return movie2;
    }
}