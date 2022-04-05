package ArrayList;

import java.util.*;
public class ArrayListSize {
    public static void main(String[] args) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        System.out.println("ArrayList: " + primeNumbers);
        int size = primeNumbers.size();
        System.out.println("Length of ArrayList: " + size);
    }
}

