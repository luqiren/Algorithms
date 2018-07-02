package design;

public class SumOfTwoNum {
    public static void main (String[] args) {
        int[] nums = {5, 11, 7, 2};
        int[] result = twoSum1(nums, 9);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
    // 方法一：时间复杂度为O(n^2)
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    // 方法二：采用哈希表，哈希表查找时间为O(1)

}
