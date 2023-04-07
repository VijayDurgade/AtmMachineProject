package com.atmprogramming;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        AtmOperation operation = new AtmOperationImpl();

        int atmNumber = 12345;
        int atmPin = 123;

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to State Bank Of India");
        System.out.print("Enter ATM Number : ");
        int enterAtmNumber = in.nextInt();
        System.out.print("Enter ATM Pin : ");
        int enterAtmPin = in.nextInt();
        if ((atmNumber == enterAtmNumber) && (atmPin == enterAtmPin)) {
            //System.out.println("Validation Done");

            while (true) {

                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Mini statement\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch = in.nextInt();
                if (ch == 1) {
                    operation.viewBalance();

                } else if (ch == 2) {
                    System.out.println("Enter Amount to Withdraw : ");
                    double withdrawAmount = in.nextDouble();
                    operation.withdrawAmount(withdrawAmount);

                } else if (ch == 3) {
                    System.out.println("Enter Amount to Deposit : ");
                    double depositAmount = in.nextDouble();
                    operation.depositAmount(depositAmount);

                } else if (ch == 4) {
                    operation.viewMiniStatement();

                } else if (ch == 5) {
                    System.out.println("Collect your ATM card\nThank you for using ATM machine");
                    System.exit(0);
                } else {
                    System.out.println("Please enter correct choice");
                }
            }
        } else {
            System.out.println("Incorrect Atm Number or Atm Pin");
        }
        System.exit(0);
    }
}
