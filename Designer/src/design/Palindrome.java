package design;

public class Palindrome {
    public static void main (String[] args) {
        System.out.print(isPalindrome(-1));
    }
    public static boolean isPalindrome(int x) {
        if (x < 10) {
            return x >= 0;
        }
        return true;
    }
}
