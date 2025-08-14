// Find Maximum  and Minimum in an ArrayList
// list 2, 5, -9, 3, 6
package Array_List;

import java.util.ArrayList;

public class Exp4 {

    public static int max(ArrayList<Integer> lst) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < lst.size(); i++) {
            // if (max < lst.get(i)) {
            // max = lst.get(i);
            // }
            max = Math.max(max, lst.get(i));
        }
        return max;
    }

    public static int min(ArrayList<Integer> lst) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < lst.size(); i++) {
            if (min > lst.get(i)) {
                min = lst.get(i);
            }
            // min = Math.min(min, lst.get(i));
        }
        return min;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(-9);
        list.add(3);
        list.add(6);

        System.out.println("The Array list is: " + list);

        System.out.println("The Maximum value in Arraylist is: " + max(list));
        System.out.println("The Minimum value in Arraylist is: " + min(list));

    }
}
