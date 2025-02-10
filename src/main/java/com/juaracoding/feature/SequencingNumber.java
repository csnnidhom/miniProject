package com.juaracoding.feature;

import com.juaracoding.model.Product;

import java.util.ArrayList;

public class SequencingNumber {

    public static void sequence(ArrayList<Product> listProduct) {
        for (int i = 0; i < listProduct.size(); i++) {
            listProduct.get(i).displayedNumber = i+1;
        }
    }
}
