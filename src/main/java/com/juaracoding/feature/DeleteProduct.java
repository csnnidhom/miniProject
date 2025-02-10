package com.juaracoding.feature;

import com.juaracoding.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteProduct {

    public static void delete(ArrayList<Product> listProduct, Scanner input) {
        ViewProduct.view(listProduct);

        if (!listProduct.isEmpty()){
            System.out.print("input number of product to delete :");

            while (!input.hasNextInt()) {
                System.out.println("please enter a valid number");
                input.next();
            }

            int index = input.nextInt();
            input.nextLine();

            if ((index >= 1 && index <= listProduct.size())){
                listProduct.remove(index-1);
                System.out.println("product deleted");
            }else {
                System.out.println("product not found");
            }
        }
    }
}
