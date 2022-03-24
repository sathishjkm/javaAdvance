package com.inheritance;
import com.inheritance.SportsMan;
public class Run {
    public static void main(String []args){
        SportsMan Obj=new SportsMan("kiruba",30,"orathanadu","cricket player");
        System.out.println(Obj.name);
        System.out.println(Obj.age);
        System.out.println(Obj.city);
        System.out.println(Obj.player);
    }
}
