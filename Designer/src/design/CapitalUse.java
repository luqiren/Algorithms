package design;

public class CapitalUse {
    public static void main (String[] args) {
    }
    public boolean detectCapitalUse(String word) {
        if (word.length() == 0) {
            return false;
        }
        char temp = word.charAt(0);
        if(Character.isUpperCase(temp)) {
            for (int i = 1; i < word.length(); i++) {

            }
        } else if (Character.isLowerCase(temp)) {

        }
        return true;
    }
}
