package N_0009_palindrome_number;

public class Solution {

    private static boolean checkPalindrome(String number) {
        int left = 0;
        int right = number.length() - 1;

        while (left < right) {
            if (number.charAt(left) != number.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        String number = String.valueOf(x);
        return checkPalindrome(number);
    }

    public static void main(String[] args) {
        int x = 121;
        boolean result = isPalindrome(x);
        System.out.print(result);
    }
}
