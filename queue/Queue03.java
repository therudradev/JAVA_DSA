package queue;

// Queue using LinkedList

public class Queue03 {
    static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedListQueue {
        static Node head = null;
        static Node tail = null;

        // isempty
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // enqueue
        public static void enqueue(int data) {
            Node newNode = new Node(data);

            // add first
            if (isEmpty()) {
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // dequeue
        public static int dequeue() {
            if (isEmpty()) {
                return -1;
            }

            int front = head.data;
            // case for single element
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.data;
        }

        // display
        public static void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        LinkedListQueue q = new LinkedListQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.print();
        q.dequeue();
        q.dequeue();
        System.out.println(q.peek());
        q.print();
    }
}
