package queue;

import java.util.Stack;

// Queue using 2 stack
//  two method we have 1.push O(n) 2.pop O(n)
// this is 2. pop O(n) method.
public class Queue06 {
    static class QueueUsing2Stacks {
        static Stack<Integer> s1 = new Stack<>(); // main stack
        static Stack<Integer> s2 = new Stack<>(); // temp stack

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add push O(1)
        public static void add(int data) {
            s1.push(data);
        }

        // remove O(n)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            int top = s2.pop();

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return top;
        }

    }

    public static void main(String[] args) {
        QueueUsing2Stacks q = new QueueUsing2Stacks();
        q.add(10);
        q.add(20);
        q.add(30);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
        System.out.println();
    }
}
