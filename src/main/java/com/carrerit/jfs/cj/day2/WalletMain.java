package com.carrerit.jfs.cj.day2;

import java.util.Scanner;

public class WalletMain {
    public static void main(String[] args) {
        WalletService walletService = new WalletService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-".repeat(100));
            System.out.println(" ".repeat(40) + " Welcome to Wallet Service  " + " ".repeat(40));
            System.out.println("1. Create 2. Deposit 3. Transfer 4. View All 5. Withdraw 6. Show Details 7. Delete Wallet 8. Exit");
            System.out.println("-".repeat(100));
            System.out.println("Enter your choice :");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    Wallet wallet = getWalletInfo();
                    walletService.createWallet(wallet);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Enter the mobile :");
                    String mobile = sc.nextLine();
                    System.out.println("Enter the amount :");
                    double amount = sc.nextDouble();
                    System.out.println("Mobile number " + mobile);
                    walletService.loadMoney(mobile, amount);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Enter the from mobile number ");
                    String fromMobile = sc.nextLine();
                    System.out.println("Enter the to mobile number ");
                    String toMobile = sc.nextLine();
                    System.out.println("Enter the amount ");
                    double transferAmount = sc.nextDouble();
                    walletService.transferAmount(fromMobile, toMobile, transferAmount);
                    break;
                case 4:
                    walletService.viewWallet();
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Enter the mobile :");
                    String mobile1 = sc.nextLine();
                    System.out.println("Enter the amount :");
                    double amount1 = sc.nextDouble();
                    System.out.println("Mobile number " + mobile1);
                    walletService.withdrawMoney(mobile1, amount1);
                    break;
                case 6:
                    walletService.showDetails();
                    break;
                case 7:
                    Wallet wallet1 = deleteWall();
                    walletService.deleteWallet(wallet1);
                    break;
                case 8:
                    System.out.println("Thank you for using the wallet ");
                    System.exit(0);
            }
        }
    }

    private static Wallet getWalletInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mobile number ");
        String mobile = sc.nextLine();
        System.out.println("Enter the name ");
        String name = sc.nextLine();
        System.out.println("Enter the balance ");
        double balance = sc.nextDouble();
        Wallet wallet = new Wallet(name, mobile, balance);
        return wallet;
    }

    private static Wallet deleteWall() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mobile number ");
        String mobile = sc.nextLine();
        System.out.println("Enter the name ");
        String name = sc.nextLine();
        System.out.println("Enter the balance ");
        double balance = sc.nextDouble();
        Wallet wallet1 = new Wallet(name, mobile, balance);
        return wallet1;
    }
}