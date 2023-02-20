package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext2.xml");

//      scope="prototype"
        Car car1 = context.getBean("customCar", Car.class);
        Car car2 = context.getBean("customCar", Car.class);

//      scope="singleton"
        Car car3 = context2.getBean("customCar", Car.class);
        Car car4 = context2.getBean("customCar", Car.class);

        car1.go();
        System.out.println();

        Person person1 = context.getBean("customPerson", Person.class);
        System.out.println();

        person1.drive();
        System.out.println();

        System.out.println(car1 == car2);
        System.out.println(car3 == car4);

        context.close();
        context2.close();
    }
}
