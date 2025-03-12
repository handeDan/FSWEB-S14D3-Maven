package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        System.out.println("Holden's engine is starting");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "Holden's engine is starting";
    }

    @Override
    public String accelerate(){
        System.out.println("Holden is accelerating");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "Holden is accelerating";
    }

    @Override
    public String brake(){
        System.out.println("Holden is braking");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "Holden is braking";
    }
}
