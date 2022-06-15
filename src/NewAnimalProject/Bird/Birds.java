package NewAnimalProject.Bird;

import NewAnimalProject.Animal.Animal;

public class Birds extends Animal {
    protected boolean feathers;
    protected boolean canFly;

    public Birds() {
        this.feathers = true;
        this.canFly = true;
    }
}
