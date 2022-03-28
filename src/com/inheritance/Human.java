package com.inheritance;
import com.inheritance.Girl;
public class Human {
    public static void main(String[] args){
        Girl Obj=new Girl("dhivya","mohan",24,"female");
        System.out.println("name is:"+Obj.name);
        System.out.println("father name is:"+Obj.father_name);
        System.out.println("age is:"+Obj.age);
        System.out.println("gender is:"+Obj.gender);
    }
}
