package SortingReversal;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        //can also work with LIST as well as LinkedList
        LinkedList<String> countries = new LinkedList<>();
        countries.add("jhgsyg");
        countries.add("hgdfyhf");
        countries.add("tyehd");
        countries.add("eyhdht");
        countries.add("ndgd");
        countries.add("xewf");
        //App app = new App();
        //app.printList(countries);
        System.out.println("***********");
        countries.sort(null);  //sorting
        System.out.println(countries);
        System.out.println("***********");
        Collections.reverse(countries);  // resersal
        System.out.println(countries);

    }

/*    void printList(LinkedList<String> list) {
        for (String element : list) {
            System.out.println(element);
        }

    }*/
}
