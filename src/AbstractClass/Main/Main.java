package AbstractClass.Main;

import AbstractClass.Lock.Door;
import AbstractClass.Person.NonVegan;
import AbstractClass.Person.Person;
import AbstractClass.Person.Vegan;

public class Main {
    public static void main(String[] args) {
        Person john = new Vegan();
        john.speak();
        john.eat();
        john.breath();
        john.message();
        System.out.println("**********");
        Person mia=new NonVegan();
        mia.speak();
        mia.eat();
        Door door= new Door();
        door.shopStatus();
        door.getLock().setLock(false);
        door.shopStatus();
    }

}
