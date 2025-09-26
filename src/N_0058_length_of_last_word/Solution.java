package N_0058_length_of_last_word;

public class Solution {
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String lastWord = words[words.length - 1];
        return lastWord.length();
    }

    public static void main(String[] args) {
        String text = "Hello World";
        int result = lengthOfLastWord(text);
        System.out.print(result);
    }
}
