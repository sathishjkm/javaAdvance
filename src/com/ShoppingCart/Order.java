package com.ShoppingCart;

import java.util.*;

public class Order {
    private String orderId;
    private List<Product>products;
    private int amount;
    private String customerId;
    Order(String orderId, String customerId, List<Product>products) {
        this.orderId = orderId;
        this.products = products;
        this.customerId = customerId;
        this.amount=calculateAmount(products);
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String newOrderId) {
        this.orderId = newOrderId;
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String newCustomerId) {
        this.customerId = newCustomerId;
    }
    private int calculateAmount(List<Product>products) {
        int amount = 0;
        for (Product product : products) {
            amount += product.getPrice();
        }
        return amount;
    }
}



