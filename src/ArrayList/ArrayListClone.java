package ArrayList;
import java.util.*;
public class ArrayListClone {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        System.out.println("number:" + number);
//        ArrayList<Integer>cloneNumber=(ArrayList<Integer>)number.clone();
        System.out.println("clone number;" + number.clone());
    }
}
