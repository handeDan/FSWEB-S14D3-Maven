package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    //instance variables:
    private double avgKmPerLitre;
    private int cylinders;

    //constructor:
    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    //getter methods:
    public int getCylinders() {
        return cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
    }

    //methods:
    public void startEngine(){
        System.out.println("gas engine is starting");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
    }

    public void drive(){
        System.out.println("driving on gasoline");
        runEngine();
    }
}
