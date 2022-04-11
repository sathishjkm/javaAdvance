package com.ShoppingCart;
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Product p1=new Product("100","Lg Tv",20000);
        Product p2=new Product("101","Fridge",15000);
        Product p3=new Product("103","Laptop",30000);
        List<Product>product=new ArrayList<>();//product new Arraylist object
        product.add(p1);//
        product.add(p2);//(product object Products add panrom)
        product.add(p3);//
        Customer c1=new Customer("1","sathish","papanasam",9606133);
        Order o1=new Order("22","1", product);
        c1.addOrder(o1);//custom c1 otder add panrom
        //product.clear();//product object irukuratha clear panrom
        List<Product>productList1=new ArrayList<>();
        productList1.add(p1);//pudusa product object la oru Products ahh add pannanum
        Order o2=new Order("33","1",productList1);
        c1.addOrder(o2);
        Iterator<Order>itr=c1.getOrders().iterator();
        int totalAmount=0;
        while (itr.hasNext()){
            Order ord=(Order)itr.next();
            totalAmount +=ord.getAmount();
            System.out.println(ord.getProducts().size());
            for (Product prod: ord.getProducts()){
                System.out.println(prod.getProductName());
            }
        }
        System.out.println("total amount is:"+" "+totalAmount);
    }
}
