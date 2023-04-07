package hashTable;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Hashtable<Integer, String> tabNames = new Hashtable<>();
        tabNames.put(100, "Julian Espinel");
        tabNames.put(999, "Adriana Pineda");
        tabNames.put(630, "Juan Espinel");
        tabNames.put(480, "Maria Camila");
        tabNames.put(125, "Martha Galvis ");

        readingTablaHash(tabNames);

        // To know size of table:
        System.out.println("The size is: " + tabNames.size());

        // To obtain specific item:
        System.out.println(tabNames.get(999));

        // to show the whole table
        System.out.println("the content of the entire table: " + tabNames);

        // to remove an element from the table
        System.out.println("remove Martha Galvis:  " + tabNames.remove(125));
        System.out.println("the content of the entire table: " + tabNames);

        // to know if the table contains a specific value
        if (tabNames.containsValue("Camilo Andres")) {
            System.out.println("Camilo Andres was found");
        } else {
            System.out.println("Camilo Andres was not found");
        }

        // to know if the table contains a specific value
        if (tabNames.containsKey(999)) {
            System.out.println("Key 999 was found");
        } else {
            System.out.println("Key 999 was not found");
        }
    }

    private static void readingTablaHash(Hashtable<Integer, String> table) {
        Enumeration<String> enumerationNames = table.elements();
        Enumeration<Integer> enumerationKeys = table.keys();
        while (enumerationNames.hasMoreElements()) {
            System.out.println("key: " + enumerationKeys.nextElement() + " " +
                    "Name: " + enumerationNames.nextElement());
        }
    }
}


