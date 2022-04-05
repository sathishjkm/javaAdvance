package ArrayList;
import java.util.*;
public class Student {
    private String name;
    private int age;
    Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
    String getName(){
        return this.name;
    }
   void setName(String newName){
        this.name=newName;
    }
    int getAge(){
        return this.age;
    }
    void setAge(int newAge){
        this.age=newAge;
    }
}


