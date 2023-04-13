package com.careerit.jfs.cj.day1;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int num = 5;
        int res = 1;
        for (int i =2; i<=num; i++){
            res *= i;
        }
        System.out.println("Factorial of "+num+" is "+res);

    }
}
