package Multithreading;
class Brackets{

    synchronized static public void generate(String threadCode){
        for(int i=0;i<10;i++){
            if(i<5){
                System.out.print("[");
        } else {
                System.out.print("]");
            }
    }
        System.out.println("Generated thread: "+threadCode);
    }

}
public class staticSynchro {
    public static void main(String[] args) {
         new Thread(new Runnable() {
            @Override
            public void run(){
                for(int i=0;i<5;i++){
                    Brackets.generate("Thread1");
                }
            }
        }).start();
         new Thread(new Runnable() {
            @Override
            public void run(){
                for(int i=0;i<5;i++){
                    Brackets.generate("Thread2");
                }
            }
        }).start();
    }
}
