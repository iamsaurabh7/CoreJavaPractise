package NewAnimalProject.Fish;

public class Eal extends Fish {
    private String special;

    public Eal() {
        this.special = "electric shock";
    }

    public String ShowInfo() {
        return "Eal{" +
                "special='" + special + '\'' +
                ", waterBone=" + waterBone +
                ", gills=" + gills +
                ", heightfeet=" + heightfeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }


}
