package com.carrerit.jfs.cj.day2;

public class Tables {
    public static void main(String[] args) {
        int num = 10;
        for (int i =1; i<=10; i++){
            System.out.println(String.format("%s * %s = %s", num, i,num*i));
        }
        System.out.println("-".repeat(50));
        for (int i =10; i>=1; i--){
            System.out.println(String.format("%s * %s = %s", num, i,num*i));
        }
    }
}
