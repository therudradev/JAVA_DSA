package stack;
// Create Stack using ArrayList

import java.util.ArrayList;

public class StackArrayList {

    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // isEmpty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

        // size
        public static int size() {
            return list.size();
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        System.out.println(s.isEmpty());
        System.out.println(s.peek());
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s.isEmpty());

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

        System.out.println(s.isEmpty());

    }
}
