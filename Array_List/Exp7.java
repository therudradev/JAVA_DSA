// implementing multi-dimenstional array 
/*Ex.:-->
 * 1,2,3,4,5
 * 2,4,6,8,10
 * 3,6,9,12,15
 */
package Array_List;

import java.util.ArrayList;

public class Exp7 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        /*
         * Method 1 for Adding
         * ArrayList<Integer> list1 = new ArrayList<>();
         * list1.add(1);
         * list1.add(2);
         * list1.add(3);
         * list1.add(4);
         * list1.add(5);
         * mainList.add(list1);
         * 
         * ArrayList<Integer> list2 = new ArrayList<>();
         * list2.add(2);
         * list2.add(4);
         * list2.add(6);
         * list2.add(8);
         * list2.add(10);
         * mainList.add(list2);
         * 
         * ArrayList<Integer> list3 = new ArrayList<>();
         * list3.add(3);
         * list3.add(6);
         * list3.add(9);
         * list3.add(12);
         * list3.add(15);
         * mainList.add(list3);
         */

        // Method 2 for adding via loop
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(1 * i);
            list2.add(2 * i);
            list3.add(3 * i);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // printing list
        System.out.println(mainList);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + "  ");
            }
            System.out.println();
        }

    }
}
