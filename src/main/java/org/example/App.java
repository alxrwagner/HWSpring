package org.example;

import org.example.transport.Car;
import org.example.transport.Moto;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Moto moto = context.getBean("moto", Moto.class);
        Moto moto1 = context.getBean("moto", Moto.class);

        Car car = context.getBean("car", Car.class);
        Car car2 = context.getBean("car", Car.class);

        System.out.println(moto == moto1);
        System.out.println(car == car2);

        Person person = context.getBean("person", Person.class);

        moto.go();

        person.drive();

        context.close();
    }
}
