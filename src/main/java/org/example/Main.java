package org.example;

import org.example.api.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Person person = context.getBean("person", Person.class);

        person.drive();
    }
}
