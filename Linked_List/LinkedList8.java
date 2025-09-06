package Linked_List;
// Check if LL is Palindrome

public class LinkedList8 {
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

        // Check if LL is Palindrome

        private Node findMidNode(Node head) {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        public boolean checkPalindrome() {
            if (head == null || head.next == null) {
                return true;
            }

            // find middle
            Node mid = findMidNode(head);

            // Reverse 2nd half
            Node curr = mid;
            Node prev = null;
            while (curr != null) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node right = prev;
            Node left = head;

            // check if equal
            while (right != null) {
                if (left.data != right.data) {
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
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
        LinkedList l3 = new LinkedList();

        l1.addFirst(10);
        l1.addFirst(20);

        l2.addFirst(90);
        l2.addFirst(80);
        l2.addFirst(70);
        l2.addFirst(60);
        l2.addLast(50);
        l2.addLast(40);
        l2.addLast(30);

        l2.printList();

        l3.addLast(0);
        l3.addLast(1);
        l3.addLast(2);
        l3.addLast(3);
        l3.addLast(2);
        l3.addLast(1);
        l3.addLast(0);

        l3.printList();
        
        System.out.println("Check l3 for palindrom   " + l3.checkPalindrome());
        System.out.println("Check l2 for palindrom   " + l2.checkPalindrome());
        
    }
}
