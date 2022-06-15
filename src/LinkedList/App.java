package LinkedList;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();
        countries.add("jhgsyg");
        countries.add("hgdfyhf");
        countries.add("tyehd");
        countries.add("eyhdht");
        countries.add("ndgd");
        countries.add("xewf");
        System.out.println(countries);
        System.out.println("********");
        countries.add(2, "yoyo");
        countries.add("xoxo");
        new App().printList(countries);
        countries.set(1, "okok");
        System.out.println(countries);
        countries.remove(3);
        System.out.println(countries);
        countries.remove("yoyo");
        System.out.println(countries);

    }

    void printList(LinkedList<String> list) {
        for (String element : list) {
            System.out.println(element);
        }

    }
}
