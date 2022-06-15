package NewAnimalProject.Fish;

import NewAnimalProject.Animal.Animal;

public class Fish extends Animal {
    protected boolean waterBone = true;
    protected boolean gills = true;

    public Fish() {
        this.waterBone = true;
        this.gills = true;
        animalType = "fish";
    }

    public String ShowInfo() {
        return "Fish{" +
                "waterBone=" + waterBone +
                ", gills=" + gills +
                ", heightfeet=" + heightfeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }


}
