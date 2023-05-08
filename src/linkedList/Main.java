package linkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Here are the basic instructions for using linkedList.

        // Create LinkedList
        LinkedList countries = new LinkedList();

        // add elements:
        countries.add("España");
        countries.add("Colombia");
        countries.add("Mexico");
        countries.add("Peru");

        LinkedList cities = new LinkedList();

        // add elements:
        cities.add("Madrid");
        cities.add("Bogota");
        cities.add("Ciudad de Mexico");
        cities.add("Lima");

        // to know size of list:
        System.out.println("The size of list is: " + countries.size());
        System.out.println("Countries: " + countries);
        System.out.println("Cyties: " + cities);

        // obtain first element
        System.out.println("First element of countries is: " + countries.get(0));


        ListIterator<String> iteratorCountries = countries.listIterator();
        ListIterator<String> iteratorCities = cities.listIterator();

        while (iteratorCities.hasNext()) {
            if (iteratorCountries.hasNext()) {
                iteratorCountries.next();
            }
            iteratorCountries.add(iteratorCities.next());
        }
        System.out.println("Countries and Cities: " + countries);

        // remove positions 2 and 4 of cities.
        iteratorCities = cities.listIterator();
        while (iteratorCities.hasNext()) {
            iteratorCities.next();
            if (iteratorCities.hasNext()) {
                iteratorCities.next();
                iteratorCities.remove();
            }
        }
        System.out.println("Cities: " + cities);

        // remove cities from countries
        countries.removeAll(cities);
        System.out.println("Content of Countries: " + countries);
    }

}
