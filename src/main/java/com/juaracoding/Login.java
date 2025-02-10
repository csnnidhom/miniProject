package com.juaracoding;

import com.juaracoding.feature.MenuProduct;
import com.juaracoding.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static void prosesLogin() {
        String usernameAdmin = "admin";
        String passwordAdmin = "password123";
        int allowedAttempts = 3;

        boolean success = validation(usernameAdmin, passwordAdmin, allowedAttempts);
        if (success) {
            ArrayList<Product> listProduct = new ArrayList<>();

            MenuProduct.showMenu(listProduct);
        }
    }

    private static boolean validation(String username, String password, int maxAttempts) {
        Scanner input = new Scanner(System.in);
        int attempts = 0;

        while (attempts < maxAttempts){
            System.out.print("Username : ");
            String inputUsername = input.nextLine();

            System.out.print("Password : ");
            String inputPassword = input.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("You have successfully logged in");
                return true;
            }else {
                attempts++;
                System.out.println("Incorrect username or password. Attempts remaining: " + (maxAttempts-attempts));
            }
        }

        System.out.println("You have failed to log in 3 times. Your account is blocked.");
        input.close();
        return false;

    }
}
