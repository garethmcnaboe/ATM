package com.garethco;

import java.text.NumberFormat;

public class ReportBalance {

    public static void printBalance(double balance, double availableFunds) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String balanceFormatted = currency.format(balance);
        String availableFundsFormatted = currency.format(availableFunds);
        System.out.println("Account Balance");
        System.out.println("______________________________________");
        System.out.println("Your balance is: " + balanceFormatted);
        System.out.println("______________________________________");
        System.out.println("Your Available Funds are " + availableFundsFormatted);
    }
}
