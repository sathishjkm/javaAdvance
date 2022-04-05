package ArrayList;

import java.util.*;
public class ArrayListContains {
    public static void main(String[] args) {
        List<String>language=new ArrayList<>();
        language.add("Java");
        language.add("python");
        language.add("JavaScript");
        System.out.println("ArrayList:"+ language);
        System.out.println("Is Java Present In The ArrayList:");
        System.out.println(language.contains("Java"));
    }
}
