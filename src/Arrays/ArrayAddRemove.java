package Arrays;

import java.util.ArrayList;

public class ArrayAddRemove {
    static ArrayList<String> listName = new ArrayList<>();

    public static void main(String[] args) {
        listName.add("abc");
        listName.add("def");
        listName.add("dfg");
        listName.add("kut");
        listName.add("ytr");
        listName.add("ory");
        //listName.remove(0);
        ArrayAddRemove app = new ArrayAddRemove();
        app.displayList(listName);
        System.out.println(listName);
        app.removeNameByPosition(0);
        app.displayList(listName);
        System.out.println(listName);
        app.removeNameByString("def");
        app.displayList(listName);
        app.modifyString(2, "heyy");
        System.out.println(listName);
        System.out.println(listName.get(2));
        int position = app.search("ory");
        System.out.println(position);
        if (position != -1) {
            app.modifyString(position, "yoyo");
        } else {
            System.out.println("invalid");
        }
        System.out.println(listName);
    }

    void displayList(ArrayList<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    void removeNameByPosition(int position) {
        listName.remove(position);
    }

    void removeNameByString(String name) {
        listName.remove(name);
    }

    void modifyString(int index, String element) {
        listName.set(index, element);
    }

    int search(String name) {
        return listName.indexOf(name);
    }
}
