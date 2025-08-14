// implementing 
// size of array list
// printing in array in normal and reverse order
package Array_List;

import java.util.ArrayList;

public class Exp3 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list.size()); // return size of arraylist
        // print via loop

        // print list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }

        System.out.println();

        // print in reverse order
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + "  ");
        }

    }

}
