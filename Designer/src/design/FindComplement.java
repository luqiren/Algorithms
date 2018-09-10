package design;

public class FindComplement {
    public static void main (String[] args) {
        System.out.println(findComplement(5));
    }

    public static int findComplement(int num) {
        int result = 0, i = 0;
        while (num > 0) {
            result += ((num % 2) ^ 1) << i++;   // 要将数字左移回相应的位置上
             num >>= 1;  // 处理完最后一位后要右移一位
        }
        return result;
    }
}
