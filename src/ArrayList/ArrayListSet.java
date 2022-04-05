package ArrayList;
import java.util.*;
public class ArrayListSet {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("sathish");
        names.add("kumar");
        names.add("mugu");
        System.out.println("ArrayList: " + names);
        String element = names.set(1, "kavi");
        System.out.println("Updated ArrayList: " + names);
        System.out.println("Replaced Element: " + element);
    }
}
