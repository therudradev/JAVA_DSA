// swap value at of index 1 and index 3 (make function)
// swaping two number

package Array_List;

import java.util.ArrayList;

public class Exp5 {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(-9);
        list.add(3);
        list.add(6);

        System.out.println("ArrayList Before swaping " + list);

        swap(list, 1, 3);
        System.out.println("ArrayList After swaping " + list);

    }

}
