package NewAnimalProject.Reptile;

public class Crocodile extends Reptile {
    public Crocodile() {
        egg = "Hard Shelled";
    }

    public String ShowInfo() {
        return "Crocodile{" +
                "skin='" + skin + '\'' +
                ", egg='" + egg + '\'' +
                ", backbone=" + backbone +
                ", heightfeet=" + heightfeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
