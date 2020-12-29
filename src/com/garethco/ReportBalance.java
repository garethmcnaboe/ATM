package com.garethco;

import java.text.NumberFormat;

public class ReportBalance {

    private static final NumberFormat currency = null;

    public static void printBalance(double balance, double availableFunds) {
        //String closingBalanceFormatted = currency.format(balance);
        //String availableFundsFormatted = currency.format(availableFunds);
        System.out.println("Account Balance");
        System.out.println("______________________________________");
        System.out.println("Your balance is: " + balance);
        System.out.println("______________________________________");
        System.out.println("Your Available Funds are " + availableFunds);
    }
}
