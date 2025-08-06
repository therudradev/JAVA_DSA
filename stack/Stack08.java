package stack;

/*
Duplicate Parentheses Problem:
Given a balanced expression, find if it contains duplicate parentheses or not.
A set of parentheses are duplicate if the same subexpression is surrounded by multiple parentheses.
Return true if it contains duplicates, else return false.
Examples:
  (((a+(b)))+ (c+d)) -> true
  ((((a)+(b)))+(c+d)) -> true
  ((a+b)+(c+d)) -> false
  (((a+b))+c) -> true
*/
import java.util.Stack;

public class Stack08 {

    // Function to check for duplicate parentheses in a balanced expression
    public static boolean isDulicate(String str) {
        Stack<Character> s = new Stack<>(); // Stack to store characters

        // Traverse each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If current character is a closing parenthesis
            if (ch == ')') {
                int count = 0; // Counter for characters inside the current parenthesis
                // Pop elements until an opening parenthesis is found
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                // If no characters were found between the parentheses, it's a duplicate
                if (count < 1) {
                    return true; // Duplicate found
                } else {
                    s.pop(); // Pop the opening parenthesis
                }
            } else {
                // For opening parenthesis, operators, and operands, push to stack
                s.push(ch);
            }
        }

        // If no duplicate parentheses found
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        String str = "((a+b))"; // Should return true (duplicate)
        String str2 = "(a+b)"; // Should return false (no duplicate)

        System.out.println(isDulicate(str)); // Output: true
        System.out.println(isDulicate(str2)); // Output: false
    }
}
