package VehicleProject;

public class Vehicle {
    private String engine;
    private int fuel;
    private int tyre;
    private String light;

    public Vehicle() {
        this.engine = "petrol";
        this.fuel = 7;
        this.tyre = 4;
        this.light = "onn";
    }

    public Vehicle(String engine, int fuel, int tyre, String light) {
        this.engine = engine;
        this.fuel = fuel;
        this.tyre = tyre;
        this.light = light;
    }

    public String getEngine() {
        return engine;
    }

    public int getFuel() {
        return fuel;
    }

    public int getTyre() {
        return tyre;
    }

    public String getLight() {
        return light;
    }
    public void run(){
        System.out.println("running");
    }
}
