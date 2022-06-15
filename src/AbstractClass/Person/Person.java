package AbstractClass.Person;

public abstract class Person implements IsAlive,LiveLife{
    public void speak(){
        System.out.println("blah blah");
    }

    @Override
    public void breath() {
        System.out.println("is alive");
    }

    @Override
    public void message() {
        System.out.println("life is a journey");
    }

    public abstract void eat();
}
