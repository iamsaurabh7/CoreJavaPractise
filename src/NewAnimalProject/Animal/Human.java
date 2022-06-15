package NewAnimalProject.Animal;

public class Human {
    private Man man;
    private String women;

    public Human() {
        this.man = new Man();
    }

    public Human(Man man) {
        this.man = man;
    }

    @Override
    public String toString() {
        return "Human{" +
                "man='" + man + '\'' +
                '}';
    }

    public Man getMan() {
        return man;
    }
}
