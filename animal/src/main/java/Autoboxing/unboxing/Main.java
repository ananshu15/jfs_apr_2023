package Autoboxing.unboxing;

import java.util.ArrayList;

class intWrapper {
    private int value;

    public intWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);   // autoboxing
        System.out.println(list.get(0)); // unboxing

        ArrayList<intWrapper> list2 = new ArrayList<intWrapper>();
        list2.add(new intWrapper(3));  // autoboxing
        System.out.println(list2.get(0).getValue()); // unboxing

        ArrayList<Float> list3 = new ArrayList<Float>();
        list3.add(3.0f);   // autoboxing
        System.out.println(list3.get(0)); // unboxing


    }
}
