package ArrayList;
import java.util.*;
public class ArrayListClear2 {
    public static void main(String[] args) {
        List<Integer>number=new ArrayList<>();
        number.add(1);
        number.add(2);
        System.out.println("number:"+ number);
        number.clear();
        System.out.println("number:"+ number);
    }
}
