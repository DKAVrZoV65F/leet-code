package N_0053_maximum_subarray;

public class Solution {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];

        for (int num : nums) {
            sum += num;
            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.print(result);
    }
}
