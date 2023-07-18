package arrayList;

import java.util.ArrayList;

public class App {
    static ArrayList<String> listNames = new ArrayList<String>();

    public static void main(String[] args) {
        listNames.add("John");
        listNames.add("Mary");
        listNames.add("Peter");
        listNames.add("Paul");
        listNames.add("Alice");
        App app = new App();
        app.printNames();
        System.out.println("******************");
        app.removeName("Mary");
        app.printNames();
        System.out.println("******************");
        app.removeNameByIndex(2);
        app.printNames();
        System.out.println("******************");
        app.modifyName(1, "Mary");
        app.printNames();
        System.out.println("******************");
        System.out.println(app.searchName("Mary"));


    }

    void printNames() {
        for (String name : listNames) {
            System.out.println(name);
        }
    }
    void removeName(String name) {
        listNames.remove(name);
    }
    void removeNameByIndex(int index) {
        listNames.remove(index);
    }
    void modifyName(int index, String name) {
        listNames.set(index, name);
    }
    int searchName(String name) {
        return listNames.indexOf(name);
    }
}
