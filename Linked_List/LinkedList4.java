package Linked_List;

// Remove first node and return its value

public class LinkedList4 {
    public static class LinkedList {
        private Node head;
        private Node tail;
        private int size = 0;

        private class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public void addFirst(int data) {
            // step 1: create a Node
            Node newNode = new Node(data);
            size++;

            if (head == null) {
                head = tail = newNode;
                return;
            }

            // step 2: newNode next = head
            newNode.next = head; // link

            // step 3: head = newNode
            head = newNode;

        }

        public void addLast(int data) {
            // setp 1: Create new Node
            Node newNode = new Node(data);
            size++;
            if (tail == null) {
                head = tail = newNode;
                return;
            }
            // setp 2: tail.next = newNode
            tail.next = newNode;

            // setp 3: tail = newNode
            tail = newNode;
        }

        public int removeFirst() {
            if (size == 0) {
                System.out.println("LinkedList is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }

            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        public int removeLast() {
            if (size == 0) {
                System.out.println("LinkedList is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }

            // prev: size-2
            Node prev = head;
            for (int i = 0; i < size - 2; i++) {
                prev = prev.next;
            }

            int val = prev.next.data; // tail.data
            prev.next = null;
            tail = prev;
            size--;
            return val;

        }

        // Get size of this LinkedList
        public int getSize() {
            return size;
        }

        // Optional: print all elements
        public void printList() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.addFirst(10);
        l1.addFirst(20);

        l2.addFirst(5);
        l2.addFirst(15);
        l2.addFirst(25);
        l2.addFirst(30);
        l2.addLast(-5);

        System.out.println("Size of l1: " + l1.getSize()); // Output: 2
        System.out.println("Size of l2: " + l2.getSize()); // Output: 5

        l1.printList(); // 10 -> 20 -> null
        l2.printList(); // 30 -> 25 -> 15 -> 5 -> -5 -> null

        System.out.println("Remove First from l2: " + l2.removeFirst()); // Output: 30
        System.out.println("Size of l2: " + l2.getSize()); // Output: 4

        l2.printList(); // 25 -> 15 -> 5 -> -5 -> null

        System.out.println("Remove last from l2: " + l2.removeLast()); // Output: -5
        System.out.println("Size of l2: " + l2.getSize()); // Output: 3
    }
}
