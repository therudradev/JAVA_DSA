package Linked_List;

// Size of linkedList

public class LinkedList3 {
    public static class LinkedList {
        private Node head;
        private int size = 0;

        private class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // Add node to end
        public void add(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = newNode;
                return;
            }
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
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

        l1.add(10);
        l1.add(20);

        l2.add(5);
        l2.add(15);
        l2.add(25);

        System.out.println("Size of l1: " + l1.getSize()); // Output: 2
        System.out.println("Size of l2: " + l2.getSize()); // Output: 3

        l1.printList(); // 10 -> 20 -> null
        l2.printList(); // 5 -> 15 -> 25 -> null
    }
}
