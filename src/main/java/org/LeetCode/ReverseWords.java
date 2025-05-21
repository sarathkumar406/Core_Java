package org.LeetCode;

import java.util.Arrays;

public class ReverseWords {

    public static void main(String[] args) {

        String str = "a good   example";

        optimalSolution(str);

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);
        System.out.println(arr[2].length());
        String res = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i > 0) {
                if (arr[i].length() > 0) {
                    res += arr[i] + " ";
                }
            } else {
                if (arr[i].length() > 0) {
                    res += arr[i];
                }
            }
        }

        System.out.println(res.trim());
    }

    private static void optimalSolution(String str) {

        StringBuilder stringBuilder = new StringBuilder();
        String[] arr = str.split("\\s+");
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1; i >= 0; i--) {
            stringBuilder.append(arr[i]);
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder.toString().trim());
    }
}
