package N_0003_longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int result = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            int length = right - left + 1;
            result = Math.max(result, length);
            System.out.println(set);
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        int result = lengthOfLongestSubstring(s);
        System.out.print(result);
    }
}
