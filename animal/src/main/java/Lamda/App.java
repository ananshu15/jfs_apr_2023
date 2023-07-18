package Lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data {
    private String name;
    public Data(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class App {
    public static void main(String[] args) {

        List<Data> list = new ArrayList<>();
        list.add(new Data("Ananshu"));
        list.add(new Data("Sam"));
        list.add(new Data("Raj"));
        list.add(new Data("Rahul"));

        Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        for (Data data : list) {
            System.out.println(data);
        }

    }
}
