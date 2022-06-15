package NewAnimalProject.Reptile;

import NewAnimalProject.Animal.Animal;

public class Reptile extends Animal {
    protected String skin, egg;
    protected boolean backbone;

    public Reptile() {
        this.heightfeet = 5;
        weightInKilos = 20;
        animalType = "Reptile";
        bloodType = "cold";
        this.skin = "Dry Skin";
        this.egg = "Soft Shelled";
        this.backbone = true;
    }

    public String ShowInfo() {
        return "Reptile{" +
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
