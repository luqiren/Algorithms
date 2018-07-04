package design;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ValidParentheses {
    public static void main (String[] args) {
        String s = "(([]){})";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }
        Set<String> set = new HashSet<>();
        set.add("()");
        set.add("[]");
        set.add("{}");
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        String temp = "";
        Character t;
        for (int i = 1; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }
            t = stack.pop();
            temp = t.toString() + s.charAt(i);
            if (!set.contains(temp)) {
                stack.push(t);
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
