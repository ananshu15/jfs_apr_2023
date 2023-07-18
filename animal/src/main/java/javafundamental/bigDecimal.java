package javafundamental;

import java.math.BigDecimal;

public class bigDecimal {
    public static void main(String[] args) {
        double value1 = 1.05;
        double value2 = 2.55;
        BigDecimal bd1 = new BigDecimal("1.05");
        BigDecimal bd2 = new BigDecimal("2.55");

        System.out.println(bd1.add(bd2));
    }
}
