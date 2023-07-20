package Lamda;

import java.util.function.IntPredicate;

public class lamda2 {
    public static void main(String[] args) {
        IntPredicate isEven = (int i) -> i % 2 == 0;
        IntPredicate isOdd = (int i) -> i % 2 != 0;

        new lamda2().testDemo(12, isEven, isOdd);




    }
    void testDemo(int x, IntPredicate isEven, IntPredicate isOdd){
       if(isEven.and(isOdd).test(x)){
           System.out.println("Even and Odd");
       }
       else if(isEven.or(isOdd).test(x)){
           System.out.println("Even or Odd");
       }
       else if(isEven.negate().test(x)){
           System.out.println("Not Even");
       }
       else if(isOdd.negate().test(x)){
           System.out.println("Not Odd");
       }
       else{
           System.out.println("None");
    }

    }



}
