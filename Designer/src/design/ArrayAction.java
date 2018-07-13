package design;

public class ArrayAction {
    public static void main (String[] args) {
        int[] a = {1,2,3,0,0,0};
        int[] b = {2,5,6};
        merge(a, 3, b, 3);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = nums1.length;  // nums1实际长度
        for (int i = 0; i < n; i++) {
            int j = m + i;
            nums1[m + i] = nums2[i];
            while (j > 0) {
                if (nums1[j] >= nums1[j-1]) {
                    break;
                } else {
                    int temp = nums1[j];
                    nums1[j] = nums1[j-1];
                    nums1[j-1] = temp;
                    j--;
                }
            }
        }
    }
}
