package VehicleProject;

public class Home {
    public static void main(String[] args) {
        Bike bike= new Bike("long","petrol",5,4,"onn");
        /*System.out.println(bike.getHandle());
        System.out.println(bike.getEngine());
        System.out.println(bike.getFuel());
        System.out.println(bike.getTyre());
        System.out.println(bike.getLight());*/
        System.out.println(bike);
        //bike.run();
        //System.out.println(bike.run());
        bike.run();
    }
}
