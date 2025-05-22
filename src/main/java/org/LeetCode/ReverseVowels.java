package org.LeetCode;

public class ReverseVowels {
    public static void main(String[] args) {

        String str = "leetcode";
        String vowels = "aeiouAEIOU";

        if (str == null || str.length() <= 1) {
            System.out.println(str);
        }
        char[] chars = str.toCharArray();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }

            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(new String(chars));

    }

}
