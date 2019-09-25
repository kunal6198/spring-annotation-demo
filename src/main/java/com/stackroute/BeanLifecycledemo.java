package com.stackroute;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycledemo {

    @PostConstruct
    public void customInit()
    {
        System.out.println("Method customInit() invoked...");
    }

    @PreDestroy
    public void customDestroy()
    {
        System.out.println("Method customDestroy() invoked...");
    }
}
