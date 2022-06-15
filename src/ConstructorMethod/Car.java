package ConstructorMethod;

public class Car {

    public Car() {
        person = "yes";
        engine = "on";
        speed = 0;
    }

    //method overloading
    public Car(String person, String engine, int speed) {
        this.person = person;
        this.engine = engine;
        this.speed = speed;
    }

    private String person;
    private String engine;
    private int speed;

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String run() {
        if (person.equals("yes") && engine.equals("on") && speed > 0) {
            return "running";
        } else
            return "not running";
    }
}

