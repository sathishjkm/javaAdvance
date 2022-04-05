package ArrayList;

import java.util.*;
public class arrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("ArrayList: " + primeNumbers);
        int removedElement = primeNumbers.remove(1);
        System.out.println("Removed Element: " + removedElement);
    }
}


