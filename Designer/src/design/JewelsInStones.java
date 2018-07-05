package design;

import java.util.HashSet;
import java.util.Set;

public class JewelsInStones {
    public static void main (String[] args) {
        String J = "z", S = "ZZ";
        System.out.println(numJewelsInStones(J, S));
    }
    public static int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        int num = 0;
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) {
                num++;
            }
        }
        return num;
    }
}
