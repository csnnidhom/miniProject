package com.juaracoding.model;

public class Product {
    public String nameProduct;
    public String category;
    public double price;
    int stock;

    int number = 0;

    public Product(String nameProduct, String category,double price,  int stock) {
        this.nameProduct = nameProduct;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return number++ +
                ". Name \t: " + nameProduct +
                "\n   Category : " + category +
                "\n   Price \t: " + price +
                "\n   Stock \t: " + stock ;
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

    public int getNumber() {
        return number;
    }
}
