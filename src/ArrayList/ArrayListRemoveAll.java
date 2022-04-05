package ArrayList;

import java.util.ArrayList;

public class ArrayListRemoveAll {
    public static void main(String[] args) {
        ArrayList<String>language1=new ArrayList<>();
        language1.add("Java");
        language1.add("Python");
        language1.add("JavaScript");
        System.out.println("list of language1:"+ language1);
        ArrayList<String>language2=new ArrayList<>();
        language2.add("Java");
        language2.add("Python");
        System.out.println("list of language2:"+language2);
        language1.removeAll(language2);
        System.out.println("after removeAll language:"+language1);
    }
}
