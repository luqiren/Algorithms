package skill;

/**
 * 问题：给你n个无序的int整型数组arr，并且这些整数的取值范围都在0-20之间，要你在 O(n) 的时间复杂度中把这 n 个数按照从小到大的顺序打印出来。
 */
public class ArrayIndex {
    public static void main(String[] args) {
        int[] input = {2, 20, 19, 2, 3, 2, 3};
        f(input);
    }

    /**
     * 数组temp下标的数字为该下标数字出现的次数，以{2, 20, 19, 2, 3, 2, 3}数组为例
     * temp数组为{0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}
     * 适用于数字较小的情况
     * @param arr
     */
    public static void f(int arr[]) {
        int[] temp = new int[21];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < temp[i]; j++) {
                System.out.println(i);
            }
        }
        System.out.println();
        for (int i = 0; i < 21; i++) {
            System.out.println(temp[i]);
        }
    }
}
