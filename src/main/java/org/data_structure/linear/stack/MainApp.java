package org.data_structure.linear.stack;

public class MainApp {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(100);
        System.out.println(stack.peek());
        stack.pop();
        //stack.pop();
        System.out.println(stack.peek());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        stack.clear();
        System.out.println(stack);
    }
}
