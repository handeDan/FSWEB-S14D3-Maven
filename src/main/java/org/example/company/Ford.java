package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        System.out.println("Ford's engine is starting");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "Ford's engine is starting";
    }

    @Override
    public String accelerate(){
        System.out.println("Ford is accelerating");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "Ford is accelerating";
    }

    @Override
    public String brake(){
        System.out.println("Ford is braking");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "Ford is braking";
    }
}
