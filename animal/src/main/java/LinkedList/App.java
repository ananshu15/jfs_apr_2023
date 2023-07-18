package LinkedList;

import Stack.Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> countries = new LinkedList<>();

        countries.add("India");
        countries.add("USA");
        countries.add("China");
        countries.add("Russia");
        countries.add("UK");
        countries.add("France");
        new App().printList(countries);

        List<String> countries2 = new ArrayList<>();

        countries2.add("Tiger");
        countries2.add("Lion");
        countries2.add("Elephant");
        countries2.add("Deer");

        new App().printList(countries2);


    }


        void printList (List<String> countries) {
            for (String country : countries) {
                System.out.println("Countries :" +country);
            }
            System.out.println("*********************************");
        }
    }

