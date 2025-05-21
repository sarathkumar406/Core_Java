package org.programs;

public class EvenDigits  {

    public static void main(String[] args) {

        int[] arr = {12,456,2345,5678,567};

        int evenDigitsCount = 0;

        for(int num : arr){
            int flag = String.valueOf(num).length();
            if(flag % 2 == 0){
                evenDigitsCount++;
            }
        }

        System.out.println(evenDigitsCount);
    }
}
