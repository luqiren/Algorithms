package design;

import java.util.Stack;

public class MedianSortedArrays {
    public static void main (String[] args) {
        int[] a = {};
        int[] b = {2, 3};
        System.out.print(findMedianSortedArrays(a, b));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            if (nums2.length % 2 == 0) {
                double d = (nums2[nums2.length / 2 - 1] + nums2[nums2.length / 2]);
                d = d / 2;
                return d;
            } else {
                return nums2[nums2.length / 2];
            }
        }
        if (nums2.length == 0) {
            if (nums1.length % 2 == 0) {
                double d = (nums1[nums1.length / 2 - 1] + nums1[nums1.length / 2]) / 2;
                return d;
            } else {
                return nums1[nums1.length / 2];
            }
        }
        int mid = (nums1.length + nums2.length) / 2;
        int i = 0, j = 0, index = 0;
        Stack<Integer> stack = new Stack<>();
        while (index <= mid && i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                stack.push(nums1[i]);
                i++;
            } else {
                stack.push(nums2[j]);
                j++;
            }
            index++;
        }
        while (index <= mid && i < nums1.length) {
            stack.push(nums1[i]);
            i++;
            index++;
        }
        while (index <= mid && j < nums2.length) {
            stack.push(nums2[j]);
            j++;
            index++;
        }
        if (stack.isEmpty()) {
            return 0.0;
        }
        if ((nums1.length + nums2.length) % 2 == 0) {
            double a, b;
            a = stack.pop();
            b = stack.pop();
            double d = ( a + b) / 2;
            return d;
        } else {
            return stack.pop().doubleValue();
        }
    }
}
