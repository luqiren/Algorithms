package design;

public class XOR {
    public static void main (String[] args) {
        int[] a = {2, 3, 4, 6, 3, 4, 2};
        singleNumber(a);
        System.out.println(0^-1);
    }

    public static int singleNumber(int[] A) {
        int num = 0;
        for(int i=0;i<A.length;i++){
            num^=A[i];
        }
        return num;
    }
}