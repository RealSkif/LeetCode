package Stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0 || s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}')
            return false;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ('(') -> stack.push('(');
                case ('[') -> stack.push('[');
                case ('{') -> stack.push('{');
                case (')') -> {
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                }
                case (']') -> {
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                }
                case ('}') -> {
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
