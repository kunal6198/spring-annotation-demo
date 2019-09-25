package com.stackroute;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    @Bean
    public Actor getactor()
    {
        Actor actor = new Actor();
        actor.setName("Amitabh Bachchan");
        actor.setGender("Male");
        actor.setAge(70);
        return actor;
    }
    @Bean
    public Movie getmovie()
    {
        Movie movie = new Movie();
        return movie;
    }
}
