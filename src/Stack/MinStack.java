package Stack;

import java.util.*;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val) {
        this.stack.push(val);
        val = Math.min(val, minStack.isEmpty() ? val : minStack.peek());
        minStack.push(val);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {

        return minStack.peek();
    }
}
