package NewAnimalProject.Animal;

public class Man {
    public int leg;
    private int hand;
    private String nose;

    public Man() {
        this.leg = 2;
    }

    public Man(int leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Man{" +
                "leg=" + leg +
                '}';
    }

    public int getLeg() {
        return leg;
    }
}
