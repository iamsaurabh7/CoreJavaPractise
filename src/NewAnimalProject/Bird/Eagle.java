package NewAnimalProject.Bird;

public class Eagle extends Birds{

    public String ShowInfo() {
        return "Eagle{" +
                "feathers=" + feathers +
                ", canFly=" + canFly +
                ", heightfeet=" + heightfeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
