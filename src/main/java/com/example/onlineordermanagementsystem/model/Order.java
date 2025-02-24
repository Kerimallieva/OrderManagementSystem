package com.example.onlineordermanagementsystem.model;

public class Order {
    private int id;
    private String product;
    private double price;

    public Order(int id, String product, double price) {
        this.id = id;
        this.product = product;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Order{id=" + id + ", product='" + product + "', price=" + price + "}";
    }
}
