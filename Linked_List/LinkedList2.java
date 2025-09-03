// add in the middle in LL
// add(data,index)

package Linked_List;

public class LinkedList2 {

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

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        // Step 1: Craete new Node
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < (index - 1)) {
            temp = temp.next;
            i++;
        }

        // i = idx-1 ; temp-> prev
        newNode.next = temp.next;
        temp.next = newNode;
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
        LinkedList2 l1 = new LinkedList2();
        l1.addFirst(50);
        l1.addFirst(40);
        l1.addFirst(30);
        l1.addFirst(20);

        l1.print();

        l1.add(4, 47);
        l1.print();

    }
}
