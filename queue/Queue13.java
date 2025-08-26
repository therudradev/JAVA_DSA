package queue;
// Implement Stack using Deque

import java.util.Deque;
import java.util.LinkedList;

public class Queue13 {
    public static class DequeStack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }

        public int peek() {
            return deque.getLast();
        }

        public int pop() {
            if (deque.isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }

            int top = deque.getLast();
            deque.removeLast();
            return top;
        }

    }

    public static void main(String[] args) {
        DequeStack ds = new DequeStack();
        ds.pop();
        ds.push(10);
        ds.push(20);
        ds.push(30);
        ds.push(40);

        System.out.println("Peek: " + ds.peek());

        while (!ds.isEmpty()) {
            System.out.println(ds.pop());
        }
    }
}
