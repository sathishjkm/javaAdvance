package com.ShoppingCart;

public class Product {
    private String id;
    private String productName;
    private int price;
    Product(String id, String productName, int price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }
    public String getId() {
        return id;
    }
    void setId(String newId){
        this.id=newId;
    }
    public String getProductName() {
        return productName;
    }
    void setProductName(String newProductName){
        this.productName=newProductName;
    }
    public int getPrice() {
        return price;
    }
    void setPrice(int newPrice){
        this.price=newPrice;
    }
}
