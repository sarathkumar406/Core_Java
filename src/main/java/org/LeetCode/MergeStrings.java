package org.LeetCode;

import java.util.Arrays;

public class MergeStrings {
    public static void main(String[] args) {

        String word1 = "abc";
        String word2 = "pq";

        char[] wordArr1 = word1.toCharArray();
        char[] wordArr2 = word2.toCharArray();
        int n = Math.max(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(i < wordArr1.length) {
                sb.append(wordArr1[i]);
            }
            if(i < wordArr2.length) {
                sb.append(wordArr2[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
