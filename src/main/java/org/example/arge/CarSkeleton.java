package org.example.arge;

public class CarSkeleton {
    //instance variables:
    private String name;
    private String description;

    //constructors:
    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //getter methods:
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    //methods:
    public void startEngine(){
        System.out.println("engine is starting");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
    }

    public void drive(){
        System.out.println("driving");
        runEngine();
    }

    protected void runEngine(){
        System.out.println("engine is running");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
    }
}
