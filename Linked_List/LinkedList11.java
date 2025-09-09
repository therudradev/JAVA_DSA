package Linked_List;
//  Java Collection Framework (LinkedList)

import java.util.LinkedList;

public class LinkedList11 {
    public static void main(String[] args) {
        // create
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(0);
        // 0->1->2
        System.out.println(ll);
        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
