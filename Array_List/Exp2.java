// Operations :-->
// Add Element O(1)
// Get Element O(1)
// Remove Element O(n)
// Set Element at Index O(n)
// Contains Element O(n)
package Array_List;

import java.util.ArrayList;

public class Exp2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.add(2, 9); // compexity O(n)
        System.out.println("List after adding 9 " + list);

        // get element at index
        int num = list.get(4);
        System.out.println("num at index 4 is: " + num);

        // remove / delete element at index
        list.remove(4);
        System.out.println("Array after removing element: " + list);

        // set element at index
        list.set(4, 5);
        System.out.println("Array after seting the element: " + list);

        // contains returns true and false
        System.out.println(list.contains(0));
        System.out.println(list.contains(5));
        System.out.println(list.contains(2));

    }
}
