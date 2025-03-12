package org.example.arge;

public class ElectricCar extends CarSkeleton{
    //instance variables:
    private double avgKmPerCharge;
    private int batterySize;

    //constructor:
    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    //getter methods:
    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    //methods:
    public void startEngine(){
        System.out.println("electric engine is starting");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
    }

    public void drive(){
        System.out.println("driving on battery power");
        runEngine();
    }


}
