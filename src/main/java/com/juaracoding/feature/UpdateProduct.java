package com.juaracoding.feature;

import com.juaracoding.model.Product;
import com.juaracoding.validation.Validation;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateProduct {

    public static void update(ArrayList<Product> listProduct, Scanner input) {
        ViewProduct.view(listProduct);

        if (!listProduct.isEmpty()){
            System.out.print("Input number product to update : " );
            while (!input.hasNextInt()){
                System.out.println("Input must be a number.");
                input.next();
            }


            int index = input.nextInt();
            input.nextLine();

            if (index >= 1 && index <= listProduct.size()){
                String newNameProduct = Validation.valNameProduct(input);
                String nameCategory = Validation.valNameCategory(input);
                double price = Validation.valPrice(input);
                int stock = Validation.valStock(input);

                Product newProduct = new Product(newNameProduct, nameCategory, price, stock);
                listProduct.set(index-1, newProduct);
                System.out.println("Product updated");
            }else {
                System.out.println("Please enter a valid number");
            }
        }

    }
}
