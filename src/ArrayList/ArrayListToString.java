package ArrayList;
import java.util.*;
public class ArrayListToString {
    public static void main(String[] args) {
        ArrayList<String> languages= new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        System.out.println("ArrayList: " + languages);
        // convert ArrayList to String
        String list = languages.toString();
        System.out.println("String: " + list);
    }
}

