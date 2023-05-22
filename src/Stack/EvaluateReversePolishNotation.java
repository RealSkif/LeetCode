package Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens));
    }

    //"2","1","+","3","*"
    public static int evalRPN(String[] tokens) {
        if (tokens.length == 1) return Integer.parseInt(tokens[0]);
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int a;
        int b;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") ||
                    tokens[i].equals("/") || tokens[i].equals("*"))
                switch (tokens[i]) {
                    case ("+") -> {
                        a = stack.pop();
                        b = stack.pop();
                        result = b + a;
                        stack.push(result);
                    }
                    case ("-") -> {
                        a = stack.pop();
                        b = stack.pop();
                        result = b - a;
                        stack.push(result);
                    }
                    case ("/") -> {
                        a = stack.pop();
                        b = stack.pop();
                        result = b / a;
                        stack.push(result);
                    }
                    case ("*") -> {
                        a = stack.pop();
                        b = stack.pop();
                        result = b * a;
                        stack.push(result);
                    }
                }
            else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return result;
    }
}
