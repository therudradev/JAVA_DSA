package Linked_List;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head; // non-static

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList(); //New object "l1" Build a new house from the blueprint
        l1.head = new Node(70);
        l1.head.next = new Node(80);

        System.out.println("First Node: " + l1.head.data);
        System.out.println("Second Node: " + l1.head.next.data);
    }
}

