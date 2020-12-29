package com.garethco;

public class Balance {
    private double openingBalance;
    public double depositAmount;
    public double withdrawalAmount;
    private double overdraft;

    public Balance() {
        this.openingBalance = 500;
        this.depositAmount = 0;
        this.withdrawalAmount = 0;
        this.overdraft = 200;
    }

    public double calculateBalance() {
        double balance = openingBalance - this.withdrawalAmount + this.depositAmount;
        return balance;
    }

    public double calculateFunds() {
        double availableFunds = openingBalance - this.withdrawalAmount + this.depositAmount + overdraft;
        return availableFunds;
    }

    public void setDepositAmount(double deposit){
        this.depositAmount = this.depositAmount + deposit;
    }

    public void setWithdrawalAmount(double withdrawal){
        this.withdrawalAmount = this.withdrawalAmount + withdrawal;
    }
}

