package org.example;

public class Person {
    Car car;

    public Person(Car car) {
        this.car = car;
    }

    public void drive(){
        System.out.println("Владелец сел в атомобиль");
        car.go();
    }
}
