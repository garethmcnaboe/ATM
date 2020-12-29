package com.garethco;

import java.util.Scanner;

public class Console {
    public static Scanner scanner = new Scanner(System.in);

    public static String readTransactionType() {
        String transactionType;
        while (true) {
            System.out.println("Welcome to the Bank of Gareth");
            System.out.println("_____________________________");
            System.out.println("What type of transaction would you like to undertake today?");
            System.out.println("_____________________________");
            System.out.println("Make a withdrawal (type w)");
            System.out.println("Make a deposit (type d)");
            System.out.println("Check balance (type b)");
            System.out.print("Please enter value:  ");
            transactionType = scanner.next();
            if (transactionType.equals("w") || (transactionType.equals("d")) || (transactionType.equals("b")))
                break;
            System.out.print("Please enter 'w' for withdrawal, 'd' for deposit or 'b' for balance. :");
        }
        return transactionType;
    }

    public static String readAnotherTransaction() {
        String anotherTransaction;
        while (true) {
            System.out.print("Would you like to undertake another transaction? (type y/n) :");
            anotherTransaction = scanner.next();
            if (anotherTransaction.equals("y") || (anotherTransaction.equals("n")))
                break;
            System.out.println("Please enter 'y' for another transaction or 'n' to log out :");
        }
        return anotherTransaction;
    }

    public static void goodbyeScreen(){
        System.out.print("Thank you for banking with Bank of Gareth.");
    }
}
