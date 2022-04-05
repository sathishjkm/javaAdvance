package ArrayList;
import java.util.*;
public class Arraylisttudent {
    public static void main(String[] args) {
        ArrayList<Student> stu=new ArrayList<>();
        Student A1=new Student("sathish",30);
        Student A2=new Student("raj",28);
        Student A3=new Student("kiruba",25);
        ArrayList<String>name=new ArrayList<>();
        name.add(A1.getName());
        name.add(A2.getName());
        name.add(A3.getName());
//        name.clear();                                             //removeAll()
//        name.remove(0);                                           //remove()
//        name.set(0,"seetha");                                     //set()
        System.out.println("Students names is:"+name);
//        System.out.println("get name:"+name.get(0));              //get()
        ArrayList<Integer>age=new ArrayList<>();
        age.add(A1.getAge());
        age.add(A2.getAge());
        age.add(A3.getAge());
//        Collections.sort(age);                                   //sort()
        System.out.println("Students ages is:"+age);
        double sum=0;
                for (int i:age){
            sum += i;
        }
        double avg=sum/age.size();                                         //size()
                System.out.println("Average of Student Age is:" +avg);
    }
}
