package com.garethco;

public class CalculateBalance {
    private double openingBalance;
    private double depositAmount;
    private double withdrawalAmount;
    private double overdraft;

    public CalculateBalance(double openingBalance, double depositAmount, double withdrawalAmount, double overdraft) {
        this.openingBalance = openingBalance;
        this.depositAmount = depositAmount;
        this.withdrawalAmount = withdrawalAmount;
        this.overdraft = overdraft;
    }

    public double calculateBalance() {
        double balance = openingBalance - withdrawalAmount + depositAmount;
        return balance;
    }

    public double calculateFunds() {
        double availableFunds = openingBalance + overdraft - withdrawalAmount + depositAmount;
        return availableFunds;
    }
}

