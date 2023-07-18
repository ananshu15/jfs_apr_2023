package javafundamental;

public class nestedLoopDesign {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
              //  for (int l = 1; l <= j; l++) { adding some extra sort of pattern
                    System.out.print("$");
                }
                System.out.println();
            }
        }
    }
//}
