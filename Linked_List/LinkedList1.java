// add in first 
// add in last
// print Linkedlist

package Linked_List;

public class LinkedList1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public Node head;
    public Node tail;

    public void addFirst(int data) {
        // step 1: create a Node
        Node newNode = new Node(data);

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
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        // setp 2: tail.next = newNode
        tail.next = newNode;

        // setp 3: tail = newNode
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList1 l1 = new LinkedList1();
        System.out.println(l1.head);
        System.out.println(l1.tail);
        l1.addFirst(10);
        System.out.println(l1.head.data);
        System.out.println(l1.tail.data);
        l1.addFirst(20);
        System.out.println(l1.head.data);
        System.out.println(l1.tail.data);
        l1.addFirst(50);
        System.out.println(l1.head.data);
        System.out.println(l1.head.next.data);
        System.out.println(l1.tail.data);

        l1.addLast(11);
        System.out.println(l1.tail.data);
        System.out.println(l1.tail.next);

        LinkedList1 l2 = new LinkedList1();
        l2.addFirst(55);
        System.out.println(l1.head.data);
        System.out.println(l2.head.data);
        l1.print();
        l2.print();

    }
}
