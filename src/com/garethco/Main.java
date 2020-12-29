package com.garethco;

public class Main {

    public static void main(String[] args) {
        double depositAmount = 0;
        double withdrawalAmount = 0;
        double openingBalance = 500;
        double overdraft = 200;

        boolean passwordCorrect = Password.EnterPassword();

                if (passwordCorrect) {

                    while (true) {

                        String transactionType = Console.readTransactionType();

                        if (transactionType.equals("d")) {
                            depositAmount += DepositScreen.readDepositAmount();
                        }

                        if (transactionType.equals("w")) {
                            //var availableFunds = new CalculateBalance(openingBalance,depositAmount,withdrawalAmount,overdraft);
                            double availableFunds = openingBalance + overdraft - withdrawalAmount + depositAmount;
                            withdrawalAmount += WithdrawalScreen.readWithdrawalAmount(availableFunds);
                        }

                        var balance = new CalculateBalance(openingBalance, depositAmount, withdrawalAmount, overdraft);
                        var report = new ReportBalance(balance);
                        report.printBalance();

                        String anotherTransaction = Console.readAnotherTransaction();

                        if (anotherTransaction.equals("n"))
                            break;
                        }
                }
        Console.goodbyeScreen();
    }
}