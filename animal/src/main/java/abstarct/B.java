package abstarct;

public class B extends A{
    @Override
    public void run() {
        System.out.println("I am Running");
    }

    @Override
    public void sleep(){
        System.out.println("I was sleeping");
    }
}
