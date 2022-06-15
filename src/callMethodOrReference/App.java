package callMethodOrReference;

public class App {
    public static void main(String[] args) {

        /*//call by value
        int value =7;
        ArrayAddRemove app = new ArrayAddRemove();
        System.out.println(+value);
        app.displayvalue(value);
        System.out.println(+value);
    }
    void displayvalue(int value){
        System.out.println(value);
        value=20;
        System.out.println(value);
    */

        //call by reference
        String[] names = {"hkjsdf", "jhdgv", "hvgdhkj", "uikasdg", "gdjfdfvs"};
        App app= new App();
        app.displaynames(names);
        System.out.println(names[0]);

    }

    void displaynames(String[] names) {
        //names[0]="samm";
        for (String name : names) {
            System.out.println(name);
        }
        names[0]="samm";
    }
}
