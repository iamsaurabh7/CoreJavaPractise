package ConstructorMethod;


public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("yes", "on", 5);
        /*car.setSpeed(10);
        System.out.println(car.getSpeed());
        car.setPerson("yes");
        System.out.println(car.getPerson());
        car.setEngine("on");
        System.out.println(car.getEngine());*/
        System.out.println(car.run());
    }
}
