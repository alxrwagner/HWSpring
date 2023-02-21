package org.example.transport;

import org.example.api.Transport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Moto implements Transport {
    @Override
    public void go() {
        System.out.println("I'm moto! I'm going!");
    }

    @PostConstruct
    public void init(){
        System.out.println("Moto is created");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Moto is destroyed");
    }
}
