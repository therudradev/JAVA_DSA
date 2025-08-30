// Create a Linked list
package Linked_List;

public class Exp1 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        head = new Node(10);
        System.out.println("First Node data: " + head.data);
        System.out.println("First Node next: " + head.next);

        head.next = new Node(20);
        System.out.println("First Node data (again): " + head.data);
        System.out.println("Second Node reference: " + head.next);
        System.out.println("Second Node data: " + head.next.data);
    }
}
