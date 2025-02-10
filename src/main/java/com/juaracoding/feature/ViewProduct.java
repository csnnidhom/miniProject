package com.juaracoding.feature;

import com.juaracoding.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ViewProduct  {

    public static void view(ArrayList<Product> listProduct) {
        if (listProduct.isEmpty()){
            System.out.println("Product is empty");
        }
        else {
            System.out.println("List Products :");
            for (Product product : listProduct) {
                System.out.println(product);
            }
        }
    }

}
