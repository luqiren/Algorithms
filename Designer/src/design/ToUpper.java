package design;

public class ToUpper {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(detectCapitalUse("UI"));
    }
    public static String toLowerCase(String str) {
        if (str.equals("")) {
            return str;
        }
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }
    public static boolean detectCapitalUse(String word) {
        if (word.charAt(0) <= 122 && word.charAt(0) >= 97) {
            for(int i = 1; i < word.length(); i++) {
                if (word.charAt(i) > 122 || word.charAt(i) < 97){
                    return false;
                }
            }
            return true;
        } else {
            if (word.length() > 1) {
                if (word.charAt(0) <= 122 && word.charAt(0) >= 97) {
                    return detectCapitalUse(word.substring(1));
                }
                for(int i = 1; i < word.length(); i++) {
                    if (word.charAt(i) > 90 || word.charAt(i) < 65){
                        return false;
                    }
                }
                return true;
            }
        }
        return true;
    }
}
