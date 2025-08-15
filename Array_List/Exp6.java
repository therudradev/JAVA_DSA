// sort the array in ascending and descending order

package Array_List;
import java.util.ArrayList;
import java.util.Collections;

public class Exp6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(-9);
        list.add(3);
        list.add(6);

        System.out.println("ArrayList Before shorting "+ list);
        
        Collections.sort(list);
        System.out.println("ArrayList after shorting in ascending: \n"+ list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("ArrayList after shorting in descending: \n"+ list);

    }
}
