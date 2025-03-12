package org.example.company;

import java.util.Objects;

public class Car {
    //instance variables:
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    //constructor:
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    //getter methods:

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    //equals method:
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    //toString method:
    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    //methods:
    public String startEngine(){
        System.out.println("the car's engine is starting");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "the car's engine is starting";
    }

    public String accelerate(){
        System.out.println("the car is accelerating");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "the car is accelerating";
    }

    public String brake(){
        System.out.println("the car is braking");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "the car is braking";
    }

}