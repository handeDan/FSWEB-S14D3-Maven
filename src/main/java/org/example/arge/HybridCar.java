package org.example.arge;

public class HybridCar extends CarSkeleton{
    //instance variables:
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    //constructor:
    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    //getter methods:
    public double getAvgKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    //methods:
    public void startEngine(){
        System.out.println("hybrid engine is starting");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
    }

    public void drive(){
        System.out.println("driving in hybrid mode");
        runEngine();
    }
}
