package N_0075_sort_colors;

import java.util.Arrays;

public class Solution {
    public static void sortColors(int[] nums) {
        int zeroPointer = 0;
        int twoPointer = nums.length - 1;
        int i = 0;

        while (i <= twoPointer) {
            if (nums[i] == 0) {
                swap(nums, i, zeroPointer);
                i++;
                zeroPointer++;
            } else if (nums[i] == 2) {
                swap(nums, i, twoPointer);
                twoPointer--;
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] nums, int num1, int num2) {
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.print(Arrays.toString(nums));
    }
}
