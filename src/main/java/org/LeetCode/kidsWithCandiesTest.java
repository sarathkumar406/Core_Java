package org.LeetCode;

import java.util.Arrays;

public class kidsWithCandiesTest {

    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        boolean[] res = kidsWithCandies(candies,extraCandies);

        System.out.println(Arrays.toString(res));

    }

    private static boolean[] kidsWithCandies(int[] candies, int extraCandies) {

        boolean[] res = new boolean[candies.length];
        int maxCandie = Integer.MIN_VALUE;
        for (int candy : candies) {
            maxCandie = Math.max(maxCandie, candy);
        }

        for(int i =0;i<candies.length;i++){
            res[i] = candies[i] + extraCandies >= maxCandie;
        }

        return res;


    }
}
