package design;

public class Distance {
    public static void main (String[] args) {
        int x = 1, y = 4;
        hammingDistance(1, 4);
    }
    public static int hammingDistance(int x, int y) {
        int distance = x ^ y;
        System.out.println(distance);
        return 0;
    }
}
