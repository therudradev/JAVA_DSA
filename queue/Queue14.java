package queue;
// Implement Queue Deque

import java.util.Deque;
import java.util.LinkedList;

import queue.Queue13.DequeStack;

public class Queue14 {
    public static class DequeQueue {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }

        public int peek() {
            return deque.getFirst();
        }

        public int pop() {
            if (deque.isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }

            int top = deque.getFirst();
            deque.removeFirst();
            return top;
        }

    }

    public static void main(String[] args) {
        DequeQueue dq = new DequeQueue();
        dq.pop();
        dq.push(10);
        dq.push(20);
        dq.push(30);
        dq.push(40);

        System.out.println("Peek: " + dq.peek());

        while (!dq.isEmpty()) {
            System.out.println(dq.pop());
        }
    }
}
