package ArrayList;
import java.util.*;
public class ArrayListaddAll3 {
    public static void main(String[] args) {
        List<Integer>primeNumber=new ArrayList<>();
        primeNumber.add(3);
        primeNumber.add(5);
        System.out.println("Prime number:"+ primeNumber);
        List<Integer>number=new ArrayList<>();
        number.add(1);
        number.add(2);
        number.addAll(primeNumber);
        System.out.println("Numbers:"+ number);
    }
}
