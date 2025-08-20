package Backtracking;

public class Permutations {
    public static void findPermutations(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        
        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            // removing ith char from orignal
            // if we have to remove 'c' from "abcd" = "ab" + "cd"
            
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // System.out.println("New String "+newStr);
            // System.out.println("Answer "+ans);

            findPermutations(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}
