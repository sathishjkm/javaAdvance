package com.ShoppingCart;
import java.util.*;

public class Customer {
    private String customerId;
    private String name;
    private String address;
    private int phoneNumber;
    private List<Order>orders=new ArrayList<>();
    Customer(String customerId, String name, String address, int phoneNumber){
        this.customerId=customerId;
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public List<Order> getOrders() {
        return orders;
    }
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    public void addOrder(Order orders){
        this.orders.add(orders);
    }
}
