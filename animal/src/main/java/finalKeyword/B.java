package finalKeyword;

import lombok.Getter;

@Getter
public class B extends A{
    private final int x =15;

    @Override
    public void India(){
        System.out.println("India is a great country@@@@@");
    }

}
