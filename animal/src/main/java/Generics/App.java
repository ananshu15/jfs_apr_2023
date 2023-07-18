package Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T>{
    private T myData;

    public Data(T myData) {
        this.myData = myData;
    }

    public T getMyData() {
        return myData;
    }

    @Override
    public String toString() {
        return "Data{" +
                "myData=" + myData +
                '}';
    }
}
public class App {

    public static void main(String[] args) {

        List<Data<Object>> elements = new LinkedList<>();
        elements.add(new Data<Object>(1));
        elements.add(new Data<Object>("Hello"));
        elements.add(new Data<Object>(2.0));
        elements.add(new Data<Object>(3.0f));
        elements.add(new Data<Object>('#'));

        App app = new App();
        app.printList(elements);

    }
    void printList (List<Data<Object>> list) {
        ListIterator<Data<Object>> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println("Element :" +iterator.next().getMyData());
        }
    }
}
