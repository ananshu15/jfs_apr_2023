package tryCatchFinal.Excep;

import java.io.FileNotFoundException;
 class UserDefinedException extends Throwable{
}

public class userDefinedExcep {
    public static void main(String[] args) {

        try {
            someMethod();
        } catch (FileNotFoundException e) {
            System.out.println("Message for FileNotFoundException");
            e.printStackTrace();
        }catch (UserDefinedException e) {
            System.out.println("Message for UserDefinedException");
        }
        catch (Exception e) {
            System.out.println("Message for Exception");
        }


    }

    public static void someMethod() throws Exception, FileNotFoundException, UserDefinedException{
        int x =1;

        switch (x){
            case 1:
                throw new FileNotFoundException();
            case 2:
                throw new Exception();
            default:
                throw new UserDefinedException();
        }
    }
}
