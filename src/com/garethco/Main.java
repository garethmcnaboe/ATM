package com.garethco;

public class Main {

    public static void main(String[] args) {
        double deposit;
        double withdrawal;
        double availableFunds;
        double balance;

        boolean passwordCorrect = Password.EnterPassword();
        Balance customer1 = new Balance();

                if (passwordCorrect) {

                    while (true) {

                        String transactionType = Console.readTransactionType();

                        if (transactionType.equals("d")) {
                            deposit = DepositScreen.readDepositAmount();
                            customer1.setDepositAmount(deposit);
                        }

                        if (transactionType.equals("w")) {
                            availableFunds = customer1.calculateFunds();
                            withdrawal = WithdrawalScreen.readWithdrawalAmount(availableFunds);
                            customer1.setWithdrawalAmount(withdrawal);
                        }

                        balance = customer1.calculateBalance();
                        availableFunds = customer1.calculateFunds();
                        ReportBalance.printBalance(balance, availableFunds);

                        String anotherTransaction = Console.readAnotherTransaction();

                        if (anotherTransaction.equals("n"))
                            break;
                        }
                }
        Console.goodbyeScreen();
    }
}