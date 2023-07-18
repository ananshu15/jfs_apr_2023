package deque;

import java.util.Deque;

public class Main {
    public static void main(String[] args) {

        Deque<Integer> deque = new java.util.ArrayDeque<>();

        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.pop();
        deque.addFirst(1);

        for (Integer integer : deque) {
            System.out.println(integer);
        }
    }
}
