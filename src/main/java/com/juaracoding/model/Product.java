package com.juaracoding.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {
    public String nameProduct;
    public String category;
    public double price;
    int stock;
    public int displayedNumber;

    private static AtomicInteger nextNumber = new AtomicInteger(1);

    public Product(String nameProduct, String category,double price,  int stock) {
        this.nameProduct = nameProduct;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.displayedNumber = nextNumber.getAndIncrement();
    }

    @Override
    public String toString() {
        return displayedNumber +
                ". Name \t: " + nameProduct +
                "\n   Category : " + category +
                "\n   Price \t: " + price +
                "\n   Stock \t: " + stock ;
    }

    public int getDisplayedNumber() {
        return displayedNumber;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

}
