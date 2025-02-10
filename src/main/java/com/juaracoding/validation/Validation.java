package com.juaracoding.validation;

import java.util.Scanner;

public class Validation {

    public static String valNameProduct(Scanner input){
        String nameProduct="";
        while(nameProduct.isBlank()){
            System.out.print("Name product : ");
            nameProduct = input.nextLine();

            if(nameProduct.isBlank()){
                System.out.println("Name product cannot be empty. Please try again");
            }
        }
        return nameProduct;
    }

    public static String valNameCategory(Scanner input){
        String nameCategory="";
        while(nameCategory.isBlank()){
            System.out.print("Name category : ");
            nameCategory = input.nextLine();

            if(nameCategory.isBlank()){
                System.out.println("Name category cannot be empty. Please try again");
            }
        }
        return nameCategory;
    }

    public static double valPrice(Scanner input){
        double price = -1;
        String inputStr;
        while (price < 0){
            System.out.print("Price : ");
            inputStr = input.nextLine();
            if (inputStr.isBlank()) {
                System.out.println("Price cannot be empty. Please try again");
            }else{
                try{
                    price = Double.parseDouble(inputStr);
                    if (price < 0){
                        System.out.println("The price cannot be empty");
                    }
                }catch (NumberFormatException e){
                    System.out.println("The price not valid");
                }
            }
        }
        return price;
    }

    public static int valStock(Scanner input){
        int stock=-1;
        String inputStr;
        while (stock < 0){
            System.out.print("Stock: ");
            inputStr = input.nextLine();
            if (inputStr.isBlank()) {
                    System.out.println("The Stock cannot be empty");
            }else {
                try{
                    stock = Integer.parseInt(inputStr);
                    if (stock < 0){
                        System.out.println("The price cannot be empty");
                    }
                }catch (NumberFormatException e){
                    System.out.println("The Stock not valid");
                }
            }
        }
        return stock;
    }
}
