package com.garethco;

import java.util.Scanner;

public class DepositScreen {
    public static Scanner scanner = new Scanner(System.in);

    public static double readDepositAmount() {
        double deposit;
        while (true) {
            System.out.println("Please enter the amount you would like to deposit: ");
            deposit = scanner.nextDouble();
            if ((deposit > 0) && (deposit <= 2_000))
                break;
            System.out.println("This ATM can only accept of €2,000 or less.");
            System.out.println("If you would like to make a deposit larger than this amount please visit one of our branches.");
            System.out.println("Please re-enter an amount less than or equal to €2,000.");
        }
        System.out.println("Thank you for your deposit.");
        return deposit;
    }
}