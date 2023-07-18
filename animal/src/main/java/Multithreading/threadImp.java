package Multithreading;

public class threadImp {
    public static void main(String[] args) {

        new Thread(new Runnable() {    //making the use of anonymous class
            @Override
            public void run() {
                for(int i=0; i<=9;i++){
                    for(int j=1; j<=i; j++){
                        System.out.print("$ @");
                    }
                    System.out.println();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
