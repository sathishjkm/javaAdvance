package ArrayList;
import java.util.*;
public class ArrayListaddAll2 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("sathish");
        name.add("kumar");
        System.out.println(name);
        List<String> city = new ArrayList<>();
        city.add("pavai");
        city.addAll(name);
        System.out.println(city);
    }
}
