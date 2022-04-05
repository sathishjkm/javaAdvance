package ArrayList;
import java.util.*;
public class ArrayListClear1 {
    public static void main(String[] args) {
        List<String>language=new ArrayList<>();
        language.add("java");
        language.add("python");
        System.out.println("language:"+ language);
        language.clear();
        System.out.println("language"+ language);
    }
}
