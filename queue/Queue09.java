package queue;
// First non-repeating Letter in a stream of characters.

// a a b c c x b

import java.util.LinkedList;
import java.util.Queue;

// a    a
// a a  -1
// a a b    b
// a a b c    b
// a a b c c    b
// a a b c c x    b
// a a b c c x b    x

// Solution approch:
// first we make 
// freq[] = [26] size for 'a'-'z'
// Queue <Charater ch> 

public class Queue09 {

    public static void printFirstNonRepeating(String str) {
        int freq[] = new int[26]; // 'a'-'z'
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print("-1" + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        printFirstNonRepeating(str);
    }
}
