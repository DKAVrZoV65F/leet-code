package N_0055_jump_game;

public class Solution {
    public static boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        int lastIndex = nums.length - 1;
        int maxReach = nums[0];

        for (int i = 1; i <= maxReach; i++) {
            if (maxReach >= lastIndex) {
                return true;
            } else {
                maxReach = Math.max(maxReach, nums[i] + i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        boolean result = canJump(nums);
        System.out.print(result);
    }
}
