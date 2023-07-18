package LinkedList;


import java.util.*;

class Names {
    private String name;

    public Names(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
public class listIterator {
    public static void main(String[] args) {

        List<Object> elements = new LinkedList<>();

        elements.add(new Names("India"));
        elements.add(new Names("USA"));
        elements.add(new Names("China"));
        elements.add(new Names("Russia"));
        elements.add(new Names("UK"));
        elements.add(1);
        elements.add(2.5);
        elements.add("Ananshu");
        elements.add('@');


        new listIterator().printList(elements);
        System.out.println("*********************************");



    }

    void printList (List<Object> list) {
        ListIterator<Object> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println("Element :" +iterator.next());
        }
    }
}
