package Arrays;

import java.util.*;

public class arrayList<S> {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        // CREATE AN ARRAY LIST FOR STRING TYPE OBJECT

        cityList.add("Delhi");
        cityList.add("Mumbai");
        cityList.add("Kolkata");
        cityList.add("Ranchi");
        cityList.add("Pune");

        System.out.println("Print size of Array list :  " + cityList.size());
        //print city list size

        System.out.println("Name of all the cities:  " + cityList);
        //list all names of cities

        //print using for loop
        for (String city : cityList) {
            System.out.println(city);
        }

        //add new city
        cityList.add(2, "Chennai");

        //print after adding new city
        System.out.println("new cityList :  " + cityList);


    }
}
