package org.example.transport;

import org.example.api.Transport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Car implements Transport {

    @Override
    public void go(){
        System.out.println("Автомобиль едет");
    }

    @PostConstruct
    public void init(){
        System.out.println("The Car created ");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("The Car destroyed ");
    }
}
