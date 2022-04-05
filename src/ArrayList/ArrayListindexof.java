package ArrayList;

import java.util.*;
public class ArrayListindexof {
    public static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<>();
        number.add(22);
        number.add(13);
        number.add(35);
        System.out.println("Number ArrayList: " + number);
        int position1=number.indexOf(13);
        System.out.println("index of 13:"+position1);
        int position2=number.indexOf(36);
        System.out.println("index of 50:"+position2);
    }
}
