package design;

public class BulbSwitch {
    public static void main (String[] args) {
        System.out.print(bulbSwitch(99999));
    }
    public static int bulbSwitch(int n) {
//        int[] a = new int [n + 1];
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (j % i == 0) {
//                    a[j] ^= 1;
//                }
//            }
//        }
//        int count = 0;
//        for (int i = 1; i <= n; i++) {
//            if (a[i] == 1) {
//                count++;
//            }
//        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i * i;
            if (temp <= n) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
