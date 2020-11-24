package com.example.firebaseapp;

public class Order {
    String ordertitle1;
    String description1;

    public Order(String ordertitle1, String description1, String category1, String quantity1, String price1) {
        this.ordertitle1 = ordertitle1;
        this.description1 = description1;
        this.category1 = category1;
        this.quantity1 = quantity1;
        this.price1 = price1;
    }

    String category1;

    public String getOrdertitle1() {
        return ordertitle1;
    }

    public void setOrdertitle1(String ordertitle1) {
        this.ordertitle1 = ordertitle1;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getCategory1() {
        return category1;
    }

    public void setCategory1(String category1) {
        this.category1 = category1;
    }

    public String getQuantity1() {
        return quantity1;
    }

    public void setQuantity1(String quantity1) {
        this.quantity1 = quantity1;
    }

    public String getPrice1() {
        return price1;
    }

    public void setPrice1(String price1) {
        this.price1 = price1;
    }

    String quantity1;
    String price1;

}
