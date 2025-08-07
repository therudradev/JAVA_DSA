package queue;
// Queue using Java collection Framework

import java.util.*;

public class Queue04 {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // Another method to implement Queue is by using ArraryDeque
        // Queue<Integer> q = new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

    while (!q.isEmpty()) {
        System.out.println(q.peek());
        q.remove();
    }
    }
}
