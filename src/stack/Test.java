package stack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(3);
        stack.push(2);
        stack.push(1);

//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
