package queue;

import java.util.Stack;

// Queue using 2 stack
//  two method we have 1.push O(n) 2.pop O(n)
// this is 1. push O(n) method.
public class Queue05 {
    static class QueueUsing2Stack {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add push O(n)
        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

    }

    public static void main(String[] args) {
        QueueUsing2Stack q = new QueueUsing2Stack();
        q.add(10);
        q.add(20);
        q.add(30);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
        System.out.println();
    }
}
