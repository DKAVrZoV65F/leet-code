package N_0027_remove_element;

public class Solution {

    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        int index = 0;
        while (index < length) {
            if (nums[index] == val) {
                nums[index] = nums[length - 1];
                length--;
            } else {
                index++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = removeElement(nums, val);
        System.out.print(result);
    }
}
