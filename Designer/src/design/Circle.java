package design;

public class Circle {
    public static void main (String[] args) {
        String s = "UD";
        System.out.println(judgeCircle(s));
    }
    public static boolean judgeCircle(String moves) {
        int[] a = {0, 0};
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    a[1] += 1;
                    break;
                case 'D':
                    a[1] -= 1;
                    break;
                case 'L':
                    a[0] -= 1;
                    break;
                case 'R':
                    a[0] += 1;
                    break;
                default:
                    break;
            }
        }
        return a[0] == 0 && a[1] == 0;
    }
}
