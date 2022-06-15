package NewAnimalProject.Animal;

public class Animal {
    protected float heightfeet;
    protected float weightInKilos;
    protected String animalType;
    protected String bloodType;
    private Human human;

    public Animal() {
        this.heightfeet = 0;
        this.weightInKilos = 0;
        this.animalType = "unknown";
        this.bloodType = "unkown";
    }

    public String ShowInfo() {
        return "Animal{" +
                "heightfeet=" + heightfeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }


}
