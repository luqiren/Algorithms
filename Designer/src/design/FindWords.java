package design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindWords {
    public static void main(String[] args) {
        String[] s = {"Hello", "Alaska", "Dad", "Peace"};
        String[] s1 = findWords(s);
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }
        System.out.println((5 >> 1) + 5);
        System.out.println((5 >> 1) ^ 5);
    }

    public static String[] findWords (String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('q', 0);
        map.put('w', 0);
        map.put('e', 0);
        map.put('r', 0);
        map.put('t', 0);
        map.put('y', 0);
        map.put('u', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('p', 0);

        map.put('a', 1);
        map.put('s', 1);
        map.put('d', 1);
        map.put('f', 1);
        map.put('g', 1);
        map.put('h', 1);
        map.put('j', 1);
        map.put('k', 1);
        map.put('l', 1);

        map.put('z', 2);
        map.put('x', 2);
        map.put('c', 2);
        map.put('v', 2);
        map.put('b', 2);
        map.put('n', 2);
        map.put('m', 2);

        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String s = words[i].toLowerCase();
            int first = map.get(s.charAt(0));
            boolean diff = false;
            for (int j = 1; j < s.length(); j++) {
                if (map.get(s.charAt(j)) != first) {
                    diff = true;
                    break;
                }
            }
            if (!diff) {
                res.add(words[i]);
            }
        }
        String[] resString = new String[res.size()];
        for (int i = 0; i < resString.length; i++) {
            resString[i] = res.get(i);
        }

        return resString;
    }
}
