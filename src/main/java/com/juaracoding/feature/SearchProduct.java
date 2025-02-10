package com.juaracoding.feature;

import com.juaracoding.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchProduct {

    public static void menuSearch(ArrayList<Product> listProduct, Scanner input){
        int choice;

        do {
            System.out.println("=== Menu Search ===");
            System.out.println("1. Search By Name Product");
            System.out.println("2. Search By Category");
            System.out.println("3. Search By Price Range");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");

            while (!input.hasNextInt()){
                System.out.println("Invalid input. Please enter a number");
                input.next();
            }

            choice = input.nextInt();
            input.nextLine();

            switch (choice){
                case 1:
                    searchByNameProduct(listProduct, input);
                    break;
                case 2:
                    searchByCategory(listProduct, input);
                    break;
                case 3:
                    searchByPriceRange(listProduct,input);
                case 4:
                    MenuProduct.showMenu(listProduct);
                    break;
                default:
                    System.out.println("The number you entered is wrong");
            }
        }while (choice != 3);
    }

    private static void searchByPriceRange(ArrayList<Product> listProduct, Scanner minPrice) {

        double valueMinPrice = inputMinPrice(minPrice);
        double valueMaxPrice = inputMaxPrice(minPrice,valueMinPrice);

        ArrayList<Product> searchResults = new ArrayList<>();
        for (Product product : listProduct){
            if (product.price >= valueMinPrice && product.price <= valueMaxPrice){
                searchResults.add(product);
                SequencingNumber.sequence(searchResults);
            }
        }
        showResult(searchResults);
    }

    private static void searchByNameProduct(ArrayList<Product> listProduct, Scanner input) {
        System.out.print("Search by name product : ");
        String keywoard = input.nextLine().toLowerCase();

        ArrayList<Product> searchResults = new ArrayList<>();
        for (Product product : listProduct) {
            if (product.nameProduct.toLowerCase().contains(keywoard)) {
                searchResults.add(product);
                SequencingNumber.sequence(searchResults);
            }
        }

        showResult(searchResults);
    }

    private static void searchByCategory(ArrayList<Product> listProduct, Scanner input) {
        System.out.print("Search by category : ");
        String keywoard = input.nextLine().toLowerCase();

        ArrayList<Product> searchResults = new ArrayList<>();
        for (Product product : listProduct) {
            if (product.category.toLowerCase().contains(keywoard)) {
                searchResults.add(product);
                SequencingNumber.sequence(searchResults);
            }
        }

        showResult(searchResults);
    }

    private static void showResult(ArrayList<Product> searchResults) {
        if (searchResults.isEmpty()){
            System.out.println("No products found");
        }else {
            System.out.println("Search result : ");
            for (int i = 0; i < searchResults.size(); i++) {
                System.out.println(searchResults.get(i));
            }
        }
    }

    private static double inputMinPrice(Scanner minPrice) {
        double valueMinPrice = -1;
        String inputStr;
        while (valueMinPrice < 0){
            System.out.print("Min Price : ");
            inputStr = minPrice.nextLine();
            if (inputStr.isBlank()) {
                System.out.println("Price cannot be empty. Please try again");
            }else{
                try{
                    valueMinPrice = Double.parseDouble(inputStr);
                    if (valueMinPrice < 0){
                        System.out.println("The price cannot be empty");
                    }
                }catch (NumberFormatException e){
                    System.out.println("The price not valid");
                }
            }
        }
        return valueMinPrice;
    }

    private static double inputMaxPrice(Scanner maxPrice, double minPrice) {
        double valueMaxPrice = -1;
        String inputStr;
        while (valueMaxPrice < 0){
            System.out.print("Max Price : ");
            inputStr = maxPrice.nextLine();
            if (inputStr.isBlank()) {
                System.out.println("Price cannot be empty. Please try again");
            }else{
                try{
                    valueMaxPrice = Double.parseDouble(inputStr);
                    if (valueMaxPrice < 0){
                        System.out.println("The price cannot be empty");
                    }

                    if (valueMaxPrice <= minPrice){
                        System.out.println("The maximum price cannot be less than the minimum price.");
                    }
                }catch (NumberFormatException e){
                    System.out.println("The price not valid");
                }
            }
        }
        return valueMaxPrice;
    }

}
