package com.carrerit.jfs.cj.day2;

import java.util.ArrayList;
import java.util.List;

public class WalletService {

    private List<Wallet> list;

    public WalletService() {
        list = new ArrayList<>();
    }

    public void createWallet(Wallet wallet) {
        if (isWalletExists(wallet.getMobile())) {
            System.out.println("The wallet already exists " + wallet.getMobile());

        } else {
            list.add(wallet);
            System.out.println("Wallet has been created successfully");
        }
    }
    public void deleteWallet(Wallet wallet1){
        if(isWalletExists(wallet1.getMobile())){
            list.remove(wallet1);
            System.out.println("Wallet has been deleted successfully ");
        } else {
            if(list.isEmpty()){
                System.out.println("There is no wallet to be deleted ");
            }
        }
    }
    public void loadMoney(String mobile, double amount) {
        if (isWalletExists(mobile)) {
            Wallet wallet = getWallet(mobile);
            wallet.deposit(amount);
        } else {
            System.out.println("There is no wallet with this given number " + mobile);
        }
    }

    public void withdrawMoney(String mobile, double amount) {
        if (isWalletExists(mobile)) {
            Wallet wallet = getWallet(mobile);
            wallet.withdraw(amount);

        } else {
            System.out.println("There is no wallet with this given number " + mobile);
        }
    }

    public void transferAmount(String fromMobile, String toMobile, double amount) {
        if (isWalletExists(fromMobile) && isWalletExists(toMobile)) {
            Wallet fromWallet = getWallet(fromMobile);
            if (fromWallet.getBalance() >= amount) {
                Wallet toWallet = getWallet(toMobile);
                fromWallet.setBalance(fromWallet.getBalance() - amount);
                toWallet.setBalance(toWallet.getBalance() + amount);

                System.out.println("Wallet with mobile " + fromMobile + " the amount " + amount + " is credited and your current balance is " + toWallet.getBalance());
                System.out.println("Wallet with mobile " + fromMobile + " the amount " + amount + " is debited and your current balance is " + fromWallet.getBalance());
            } else {
                System.out.println("You have insufficient balance ");
            }
        } else {
            System.out.println("Please provide valid from and to mobile number ");
        }
    }

    public void showDetails() {
        if (list.isEmpty()) {
            System.out.println("No wallets are created yet....");

        } else {
            double totalBalance = 0;
            for (Wallet wallet : list) {
                totalBalance += wallet.getBalance();
            }
            System.out.println("Total wallet count is  :" + list.size());
            System.out.println("Total wallet balance is  :" + totalBalance);
            System.out.println("Average wallet balance is  :" + totalBalance / (double) list.size());
        }
    }

    public void viewWallet() {
        if (list.isEmpty()) {
            System.out.println("There is no wallet created");
        } else {
            for (Wallet wallet : list) {
                System.out.println();
                wallet.showDetails();
            }
        }
    }

    private Wallet getWallet(String mobile) {
        for (Wallet wallet : list) {
            if (wallet.getMobile().equals(mobile)) {
                return wallet;
            }
        }
        return null;
    }

    private boolean isWalletExists(String mobile) {
        for (Wallet wallet : list) {
            if (wallet.getMobile().equals(mobile)) {
                return true;
            }
        }
        return false;
    }

}
