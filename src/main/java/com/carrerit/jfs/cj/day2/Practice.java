package com.carrerit.jfs.cj.day2;

import java.util.Arrays;

public class Practice {

    public static void increment(int[] numArr){
        for(int i = 0; i< numArr.length; i++){
            numArr[i] += 2;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        increment(arr);
        System.out.println(Arrays.toString(arr));
    }
}
