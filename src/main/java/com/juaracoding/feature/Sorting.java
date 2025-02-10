package com.juaracoding.feature;

import com.juaracoding.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Sorting {

    public static void sortingData(ArrayList<Product> listProduct) {
        ViewProduct.view(listProduct);

        System.out.print("Do you want to sort the data? (Y/N) : ");
        Scanner sorting = new Scanner(System.in);
        char choice = sorting.next().charAt(0);

        if (choice == 'y' || choice == 'Y') {
            sort(listProduct);
        }else if(choice == 'n' || choice == 'N') {
            MenuProduct.showMenu(listProduct);
        }else {
            System.out.println("Invalid choice");
        }
    }

    private static void sort(ArrayList<Product> listProduct) {
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("Sorting By :");
            System.out.println("1. Name (A-Z)");
            System.out.println("2. Name (Z-A)");
            System.out.println("3. Category (A-Z)");
            System.out.println("4. Category (Z-A)");
            System.out.println("5. Price (Lowest Price - Highest Price)");
            System.out.println("6. Price (Highest Price - Lowest Price)");
            System.out.println("7. Stok (Lowest - Highest)");
            System.out.println("8. Stok (Highest - Lowest)");
            System.out.println("9. Back To Main Menu");
            System.out.print("Choose Option: ");

            while (!input.hasNextInt()){
                System.out.println("Invalid input. Please enter a number");
                input.next();
            }

            option = input.nextInt();
            input.nextLine();

            switch (option){
                case 1:
                    Collections.sort(listProduct, Comparator.comparing(Product::getNameProduct));
                    SequencingNumber.sequence(listProduct);
                    break;
                case 2:
                    Collections.sort(listProduct, Comparator.comparing(Product::getNameProduct).reversed());
                    SequencingNumber.sequence(listProduct);
                    break;
                case 3:
                    Collections.sort(listProduct, Comparator.comparing(Product::getCategory));
                    SequencingNumber.sequence(listProduct);
                    break;
                case 4:
                    Collections.sort(listProduct, Comparator.comparing(Product::getCategory).reversed());
                    SequencingNumber.sequence(listProduct);
                    break;
                case 5:
                    Collections.sort(listProduct, Comparator.comparingDouble(Product::getPrice));
                    SequencingNumber.sequence(listProduct);
                    break;
                case 6:
                    Collections.sort(listProduct, Comparator.comparingDouble(Product::getPrice).reversed());
                    SequencingNumber.sequence(listProduct);
                    break;
                case 7:
                    Collections.sort(listProduct, Comparator.comparingInt(Product::getStock));
                    SequencingNumber.sequence(listProduct);
                    break;
                case 8:
                    Collections.sort(listProduct, Comparator.comparingInt(Product::getStock).reversed());
                    SequencingNumber.sequence(listProduct);
                    break;
                case 9:
                    MenuProduct.showMenu(listProduct);
                default:
                    System.out.println("There is no such option");
            }
            ViewProduct.view(listProduct);
        }while (option != 9);

    }

}
