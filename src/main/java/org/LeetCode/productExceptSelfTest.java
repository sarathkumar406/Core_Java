package org.LeetCode;

import java.util.Arrays;

public class productExceptSelfTest {
    public static void main(String[] args) {

        int[] nums = {-1,1,0,-3,3};
        int[] res = productExceptSelf(nums);


        System.out.println(Arrays.toString(res));
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        int n = nums.length;

        product[0] = 1;
        for(int i =1;i<n;i++){
            product[i] = product[i-1] * nums[i-1];
        }

        int suffixProduct = 1;
        for(int i = n-1;i>=0;i--){
            product[i] = product[i] * suffixProduct;
            suffixProduct = suffixProduct * nums[i];
        }

        return product;


    }
}
