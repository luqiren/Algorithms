package design;

import java.util.HashSet;
import java.util.Set;

public class MaxLongString {
    public static void main (String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
    // 方法一
    public static int lengthOfLongestSubstring(String s) {
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() - 1; j++) {
                if (allUnique(s, i, j)) {
                    l = Math.max(l, j - i);
                }
            }
        }
        return l;
    }
    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            if (set.contains(s.charAt(i))) {
                return false;
            }
            set.add(s.charAt(i));
        }
        return true;
    }
    // 方法二
    public static int lengthOfLongestSubstring2(String s) {
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() - 1; j++) {
                if (allUnique(s, i, j)) {
                    l = Math.max(l, j - i);
                }
            }
        }
        return l;
    }
}
