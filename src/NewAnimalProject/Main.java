package NewAnimalProject;

import NewAnimalProject.Animal.Animal;
import NewAnimalProject.Animal.Human;
import NewAnimalProject.Animal.Man;
import NewAnimalProject.Bird.Eagle;
import NewAnimalProject.Fish.Eal;
import NewAnimalProject.Fish.Fish;
import NewAnimalProject.Reptile.Crocodile;
import NewAnimalProject.Reptile.Reptile;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.ShowInfo());
        Reptile reptile = new Reptile();
        System.out.println(reptile.ShowInfo());
        Crocodile croc = new Crocodile();
        System.out.println(croc.ShowInfo());
        Fish fish = new Fish();
        System.out.println(fish.ShowInfo());
        Eal eal = new Eal();
        System.out.println(eal.ShowInfo());
        Eagle eagle = new Eagle();
        System.out.println(eagle.ShowInfo());
        Human human = new Human();
        System.out.println(human.getMan().getLeg());

        Man man = new Man(5);
        System.out.println(man);


    }
}
