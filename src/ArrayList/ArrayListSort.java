package ArrayList;
import java.util.*;
public class ArrayListSort {
    public static void main(String[] args) {
        List<Integer>numbers=new ArrayList<>();
        numbers.add(8);
        numbers.add(3);
        numbers.add(7);
        numbers.add(-10);
        System.out.println("UnSort ArrayList:"+numbers);
        numbers.sort(Comparator.naturalOrder());
        System.out.println("Sort ArrayList:"+numbers);
    }
}
