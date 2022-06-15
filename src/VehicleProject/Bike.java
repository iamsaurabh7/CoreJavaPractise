package VehicleProject;

public class Bike extends Vehicle {
    private String handle;

    public Bike() {
        super();
        this.handle = "sort";
    }

    public Bike(String handle, String engine, int fuel, int tyre, String light) {
        super(engine, fuel, tyre, light);
        this.handle = handle;
    }

    /*public String getHandle() {
        return handle;
    }*/

    @Override
    public String toString() {
        return "Bike{" + "handle='" + handle + '\'' + '}';
    }
    public void run(){
        System.out.println("running bike");
        System.out.println(toString());
    }
}
