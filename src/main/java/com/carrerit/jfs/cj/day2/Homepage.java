package com.carrerit.jfs.cj.day2;

public class Homepage {

    public static void main(String[] args) {
        Homepage obj1 = new Homepage();
        Homepage obj2 = new Homepage();
        Homepage obj3 = new Homepage();

        System.out.println(Homepage.getCount());
    }
     static int count = 0;
    public Homepage(){
        count++;
    }

    public static int getCount(){
        return count;
    }
}
