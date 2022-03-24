package com.inheritance;
import com.inheritance.Girl;
public class Humen {
    public static void main(String[] args){
        Girl Obj=new Girl("dhivya","mohan",24,"female");
        System.out.println(Obj.name);
        System.out.println(Obj.father_name);
        System.out.println(Obj.age);
        System.out.println(Obj.gender);
    }
}
