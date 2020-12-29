package com.garethco;

import java.text.NumberFormat;
import java.util.Scanner;

public class WithdrawalScreen {
    public static Scanner scanner = new Scanner(System.in);

    public static double readWithdrawalAmount(double availableFunds) {
        double withdrawalAmount;

        while (true) {
            System.out.println("Please enter the amount you would like to withdraw: ");
            withdrawalAmount = scanner.nextDouble();
            if ((withdrawalAmount % 50 == 0) && (withdrawalAmount <= 600) && (withdrawalAmount <= availableFunds)) {
                break;
            }
            if ((withdrawalAmount % 50 > 0) && (withdrawalAmount > 600)) {
                System.out.println("This ATM only holds €50 notes and allows withdrawals of €600 or less.");
                System.out.println("If you would like to make a withdrawal larger than this amount please visit one of our branches.");
                System.out.println("Please re-enter an amount less than or equal to €600 which also divides by €50.");
                continue;
            }
            if (withdrawalAmount % 50 > 0) {
                System.out.println("This ATM only holds €50 notes. Please select an amount which divides by €50.");
                continue;
            }
            if (withdrawalAmount > 600) {
                System.out.println("This ATM can only allows withdrawal of €600 or less.");
                System.out.println("If you would like to make a withdrawal larger than this amount please visit one of our branches.");
                System.out.println("Please re-enter an amount less than or equal to €600.");
                continue;
            }
            if ((withdrawalAmount > availableFunds )) {
                NumberFormat currency = NumberFormat.getCurrencyInstance();
                String result = currency.format(availableFunds);
                System.out.println("You have insufficient available funds to allow for this withdrawal.");
                System.out.println("Your available funds are: " + result);
            }
        }
        return withdrawalAmount;
    }
}