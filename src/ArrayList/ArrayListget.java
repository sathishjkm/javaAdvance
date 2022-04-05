package ArrayList;

import java.util.*;
public class ArrayListget {
    public static void main(String[] args) {
        List<String>language=new ArrayList<>();
        language.add("Java");
        language.add("python");
        language.add("JavaScript");
        System.out.println("ArrayList:"+ language);
        String list=language.get(1);
        System.out.println("List of index 1:"+ list);
    }
}
