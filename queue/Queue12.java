package queue;
// Deque (Double Ended Queue)

import java.util.Deque;
import java.util.LinkedList;

public class Queue12 {
    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1); // 1
        deque.addFirst(2); // 2 1
        deque.addFirst(3); // 3 2 1
        deque.addLast(4);
        deque.addLast(5);

        System.out.println(deque);
        System.out.println("First Element: = " + deque.getFirst());
        System.out.println("Last Element: = " + deque.getLast());

        System.out.println("Remove First Element: = " + deque.removeFirst());
        System.out.println("Remove Last Element: = " + deque.removeLast());

        System.out.println("Deque remain: " + deque);

        System.out.println("Using remove Function ");

        while (!deque.isEmpty()) {
            System.out.print(deque.remove() + " ");

        }
    }
}
