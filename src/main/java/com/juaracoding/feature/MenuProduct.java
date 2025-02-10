package com.juaracoding.feature;

import com.juaracoding.Login;
import com.juaracoding.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuProduct {

    public static void showMenu(ArrayList<Product> listProduct) {
        Scanner input = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n=== Product ===");
            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Search");
            System.out.println("6. Sorting");
            System.out.println("0. Logout");
            System.out.print("Choose an option: ");

            //validation must be number
            while (!input.hasNextInt()){
                System.out.println("Invalid input. Please enter a number");
                input.next();
            }

            choice = input.nextInt();
            input.nextLine();

            switch (choice){
                case 1:
                    CreateProduct.add(listProduct);
                    break;
                case 2:
                    ViewProduct.view(listProduct);
                    break;
                case 3:
                    UpdateProduct.update(listProduct, input);
                    break;
                case 4:
                    DeleteProduct.delete(listProduct, input);
                    break;
                case 5:
                    SearchProduct.menuSearch(listProduct, input);
                    break;
                case 6:
                    SortingProduct.sortingData(listProduct);
                case 0:
                    System.out.println("Successfully signed out");
                    Login.prosesLogin();
                default:
                    System.out.println("The number you entered is wrong");
            }
        }while (choice != 0);

    }
}
