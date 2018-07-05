package design;

public class IndexInMountainArray {
    public static void main (String[] args) {
        int[] a = {1,2,3,4,1};
        System.out.println(peakIndexInMountainArray(a));
    }
    public static int peakIndexInMountainArray(int[] A) {
        int i = 0, j = A.length - 1;
        int index;
        while (i < j) {
            int temp = (i + j) / 2;
            if (A[temp - 1] < A[temp] && A[temp] > A[temp + 1]) {
                i = temp;
                break;
            }
            if (A[temp - 1] < A[temp] && A[temp] < A[temp + 1]) {
                i = temp;
            }
            if (A[temp - 1] > A[temp] && A[temp] > A[temp + 1]) {
                j = temp;
            }
        }
        index = i;
        return index;
    }
}
