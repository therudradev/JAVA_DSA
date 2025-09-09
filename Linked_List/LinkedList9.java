package Linked_List;

// Detecting Cycle in Linked list
public class LinkedList9 {
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

        // Check Cycle / loop
        public boolean isCycle() {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next; // +1
                fast = fast.next.next; // +2
                if (slow == fast) {
                    return true; // cycle Exist
                }
            }
            return false; // Cycle doesn't exist
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

        l1.addFirst(90);
        l1.addFirst(80);
        l1.addFirst(70);
        l1.addFirst(60);
        l1.addLast(50);
        l1.addLast(40);
        l1.addLast(30);
        l1.tail.next = l1.head.next.next;

        // System.out.println("Check l1 for palindrom " + l1.checkPalindrome());
        System.out.println("Check l1 is Cyclic :  " + l1.isCycle());

    }
}
