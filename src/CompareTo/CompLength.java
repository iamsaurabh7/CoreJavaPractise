package CompareTo;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//sorting using custom method

class Names implements Comparable<Names> {
    private String name;

    public Names(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(@NotNull Names obj) {
        if (name.length() == obj.name.length()) {
            return 0;
        } else if (name.length() < obj.name.length()) {
            return -1;
        } else
            return 1;
        //sorted using length
        //smaller to greater
    }

    @Override
    public String toString() {
        return name;
    }
}

public class CompLength {
    public static void main(String[] args) {

        List name = new LinkedList<>();
        name.add(new Names("jhjhjhjhjhdtg"));
        name.add(new Names("ad"));
        name.add(new Names("trhgtg"));
        name.add(new Names("jhfyhjhdt"));
        name.add(new Names("yhff"));
        CompLength com = new CompLength();
        com.printList((LinkedList<Names>) name);

        Collections.sort(name);
        System.out.println("*********");
        System.out.println(name);
/*        LinkedList<String> countries = new LinkedList<>();
        countries.add("jhgsyg");
        countries.add("hgdfyhf");
        countries.add("tyehd");
        countries.add("eyhdht");
        countries.add("ndgd");
        countries.add("xewf");
        new Comp().printList(countries);*/


    }

    void printList(LinkedList<Names> list) {
        for (Names element : list) {
            System.out.println(element);
        }

    }
}
