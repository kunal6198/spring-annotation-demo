package com.stackroute;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Config file loaded.");
        Movie movie = factory.getBean(Movie.class);
        System.out.println("Name: "+movie.getActor().getName());
        System.out.println("Gender: "+movie.getActor().getGender());
        System.out.println("Age: "+movie.getActor().getAge());
    }
}