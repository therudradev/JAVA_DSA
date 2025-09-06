package Linked_List;
// Reverse a Linked List

public class LinkedList6 {
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

        public int itrSearch(int key) {
            Node temp = head;
            int i = 0;
            while (temp != null) {
                if (temp.data == key) { // key found
                    return i;
                }
                temp = temp.next;
                i++;
            }
            // key not found condition
            return -1;
        }

        // Recursive function helper
        public int helper(Node head, int key) {
            if (head == null) {
                return -1;
            }

            if (head.data == key) {
                return 0;
            }

            int idx = helper(head.next, key);
            if (idx == -1) {
                return -1;
            }
            return idx + 1;
        }

        // Recursive Search
        public int recSearch(int key) {
            return helper(head, key);
        }

        // Reverse a Linked List
        public void reverse() {
            Node prev = null;
            Node curr = tail = head;
            Node next;

            // remember 3 variables, 4 step
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
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

        l2.addFirst(90);
        l2.addFirst(80);
        l2.addFirst(70);
        l2.addFirst(60);
        l2.addLast(50);
        l2.addLast(40);
        l2.addLast(30);

        System.out.println("Size of l1: " + l1.getSize());
        System.out.println("Size of l2: " + l2.getSize());

        l2.printList();

        l2.reverse();
        l2.printList();

    }
}
