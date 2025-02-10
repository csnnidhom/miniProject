package com.juaracoding.feature;

import com.juaracoding.model.Product;
import com.juaracoding.validation.Validation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CreateProduct {

    public static void add(ArrayList<Product> listProduct) {
        Scanner input = new Scanner(System.in);

        String nameProduct = Validation.valNameProduct(input);
        String nameCategory = Validation.valNameCategory(input);
        double price = Validation.valPrice(input);
        int stock = Validation.valStock(input);

        Product product = new Product(nameProduct, nameCategory,price, stock);
        listProduct.add(product);
        System.out.println("Product added successfully");
    }
}
