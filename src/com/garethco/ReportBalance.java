package com.garethco;

import java.text.NumberFormat;

public class ReportBalance {

    private final NumberFormat currency;
    private CalculateBalance calculator;

    public ReportBalance (CalculateBalance calculator){
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printBalance() {
        double balance = calculator.calculateBalance();
        double availableFunds = calculator.calculateFunds();
        String closingBalanceFormatted = currency.format(balance);
        String availableFundsFormatted = currency.format(availableFunds);
        System.out.println("Account Balance");
        System.out.println("______________________________________");
        System.out.println("Your balance is: " + closingBalanceFormatted);
        System.out.println("______________________________________");
        System.out.println("Your Available Funds are " + availableFundsFormatted);
    }
}
