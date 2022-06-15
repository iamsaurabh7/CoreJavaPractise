package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Appp {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("jhgsyg");
        countries.add("hgdfyhf");
        countries.add("tyehd");
        countries.add("eyhdht");
        countries.add("ndgd");
        countries.add("xewf");
        System.out.println(countries);
        new Appp().printList(countries);
        System.out.println("****************************");
        List<String> demo = new ArrayList<>();
        demo.add("one");
        demo.add("two");
        demo.add("three");
        demo.add("four");
        new Appp().printList(demo);
        System.out.println("****************************");
        new Appp().printListIterator(countries);
        System.out.println("****************************");
        countries.sort(null);
        new Appp().printList(countries);
    }

    //using list
    void printList(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }

    }

    //using iterator
    void printListIterator(List<String> list) {
        Iterator<String> interator = list.iterator();
        while (interator.hasNext()) {
            System.out.println(interator.next());
        }
    }




}
