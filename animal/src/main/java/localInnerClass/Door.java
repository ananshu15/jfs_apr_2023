package localInnerClass;

public class Door {

    public boolean isLocked(String Key){
        class Lock{
            public boolean isLocked(String Key){
                if(Key.equals("qwerty")){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return new Lock().isLocked(Key);
    }
}
