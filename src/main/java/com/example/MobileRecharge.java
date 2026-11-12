package com.example;

import java.util.Scanner;

public class MobileRecharge {

    public static boolean validateMobileNumber(String mobileNumber) {
        return mobileNumber != null &&
               mobileNumber.matches("[6-9][0-9]{9}");
    }

    public static double getRechargeAmount(int plan) {

        switch (plan) {
            case 1:
                return 199.0;

            case 2:
                return 299.0;

            case 3:
                return 499.0;

            default:
                return -1;
        }
    }

    public static void displayPlans() {
        System.out.println("\nAvailable Recharge Plans:");
        System.out.println("1. Rs.199 - 28 Days");
        System.out.println("2. Rs.299 - 56 Days");
        System.out.println("3. Rs.499 - 84 Days");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== MOBILE RECHARGE APPLICATION =====");

        System.out.print("Enter mobile number: ");
        String mobileNumber = scanner.nextLine();

        if (!validateMobileNumber(mobileNumber)) {
            System.out.println("Invalid mobile number.");
            scanner.close();
            return;
        }

        System.out.println("Mobile number is valid.");

        displayPlans();

        System.out.print("\nSelect a recharge plan: ");
        int plan = scanner.nextInt();

        double amount = getRechargeAmount(plan);

        if (amount == -1) {
            System.out.println("Invalid plan selection.");
        } else {
            System.out.println("\nRecharge Successful!");
            System.out.println("Mobile Number: " + mobileNumber);
            System.out.println("Recharge Amount: Rs." + amount);
            System.out.println("Transaction completed successfully.");
        }

        scanner.close();
    }
}
