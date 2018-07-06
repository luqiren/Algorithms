package design;

public class Distance {
    public static void main (String[] args) {
        int x = 1, y = 4;
        System.out.println(hammingDistance(x, y));
        hammingDistance(1, 4);
    }
    public static int hammingDistance(int x, int y) {
        int distance = x ^ y;
        int count = 0;
        while(distance != 0){
            count++;
            distance = distance & (distance - 1);  // 与比自己小1的数进行并运算会把该数当前位于最低位（既从右到左的第一个1）给去掉，知道该数变为0
        }
        return count;
    }
}
