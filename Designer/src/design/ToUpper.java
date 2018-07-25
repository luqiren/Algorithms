package design;

public class ToUpper {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(toLowerCase(str));
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
}
