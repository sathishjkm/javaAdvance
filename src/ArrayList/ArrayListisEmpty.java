package ArrayList;

import java.util.*;
public class ArrayListisEmpty {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        System.out.println("Newly Created ArrayList: " + languages);
        boolean result = languages.isEmpty(); // true
        System.out.println("Is the ArrayList empty? " + result);
        languages.add("Python");
        languages.add("Java");
        System.out.println("Updated ArrayList: " + languages);

        result = languages.isEmpty();  // false
        System.out.println("Is the ArrayList empty? " + result);
    }
}

