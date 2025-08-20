package Backtracking;

public class FindSubsets {

    public static void findSubsets(String str, int i, String ans) {
        // Base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // for Yes choice
        findSubsets(str, i + 1, ans + str.charAt(i));

        // for No Choice
        findSubsets(str, i + 1, ans);

    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, 0, "");
    }
}
