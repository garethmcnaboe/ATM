package com.garethco;

import java.util.Scanner;

public class Password {

    public static boolean EnterPassword() {

        Scanner scanner = new Scanner(System.in);
        short passwordEntry = 0;
        final short passwordStored = 1892;
        boolean passwordCorrect;

        for (int i = 0; i < 4; i++){
            System.out.print("Please enter your four digit pin number:");
            passwordEntry = scanner.nextShort();
            if (passwordEntry == passwordStored)
                break;
            System.out.println("Incorrect PIN");
        }
        if (passwordEntry != passwordStored) {
            System.out.println("You have exceeded the 4 attempts to correctly enter your password.");
            System.out.println("This ATM will now retain your card. Please contact your Branch.");
        }

        else {
            System.out.println("Thank you for providing your pin number.");
        }
        passwordCorrect = passwordEntry == passwordStored;
        return passwordCorrect;
    }
}