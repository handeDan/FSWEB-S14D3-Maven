package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        System.out.println("Mitsubishi's engine is starting");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "Mitsubishi's engine is starting";
    }

    @Override
    public String accelerate(){
        System.out.println("Mitsubishi is accelerating");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "Mitsubishi is accelerating";
    }

    @Override
    public String brake(){
        System.out.println("Mitsubishi is braking");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "Mitsubishi is braking";
    }
}
