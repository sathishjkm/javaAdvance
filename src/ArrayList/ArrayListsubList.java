package ArrayList;

import java.util.*;
public class ArrayListsubList {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("JavaScript");
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        System.out.println("ArrayList: " + languages);
        System.out.println("SubList: " + languages.subList(1, 2));
    }
}

