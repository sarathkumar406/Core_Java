package org.programs;

public class SearchElementOnArray {

    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2,3};
        int k = 0;
int res = OptimizedSolution(arr,k);
        System.out.println("optimzed soultion  "+res);
        int n  = arr.length;
        boolean flag = false;
        int index = 0 ;
        for(int i =0;i<n;i++){
            if(arr[i] == k ){
               index = i;
                flag = true;
            }
        }

        if(flag){
            System.out.println(index);
        }
    }

    private static int OptimizedSolution(int[] arr, int k) {
        int n = arr.length;
        int low = 0, high = n -1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            if (arr[low] < arr[mid]) {
                if (arr[low] <= k && k <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
             else {
                if (arr[mid] <= k && k <= arr[high]) {
                    low = mid + 1;

                } else {
                    high = mid -1;
                }
            }
        }

return  -1;
    }

}
