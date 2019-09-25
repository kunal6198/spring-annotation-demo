package com.stackroute;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    Actor actor;
    private ApplicationContext applicationContext;
    private BeanFactory beanFactory;

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

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("setApplicationContext method called");
        this.applicationContext = applicationContext;

    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory method called");
        this.beanFactory = beanFactory;

    }
    public void setBeanName(String beanName) {
        System.out.println("setBeanName called");
        System.out.println("Bean name : "+beanName);

    }
}