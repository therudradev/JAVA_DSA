package stack;
//Create Stack using LinkedList

import java.util.LinkedList;

public class StackLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class Stack {
        static Node head = null;
        static int size = 0;

        // isEmpty
        public static boolean isEmpty() {
            return head == null;
        }

        // push
        public static void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
            size++;
        }

        // pop
        public static int pop() {
            if (head == null) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            size--;
            return top;
        }

        // peek
        public static int peek() {
            if (head == null) {
                return -1;
            }
            return head.data;
        }

        // size
        public static int size() {
            return size;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.size());
        s.push(50);
        s.push(40);
        s.push(30);
        s.push(20);
        s.push(10);
        System.out.println(s.size());
        System.out.println(s.pop());

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
