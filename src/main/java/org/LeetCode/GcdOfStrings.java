package org.LeetCode;

public class GcdOfStrings {

    public static void main(String[] args) {

        String str1 = "ABABABA";
        String str2 = "ERT";
        System.out.println(gcdOfTwoStrings(str1,str2));

        System.out.println(optimalGcdOfTwoStrings(str1,str2));

    }

    private static String optimalGcdOfTwoStrings(String str1, String str2) {

        if(!(str1 + str2).equals(str2+str1)){
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0,gcdLength);
    }

    private static int gcd(int a, int b) {
        if(b==0)
            return a;
        return gcd(b,a%b);

    }

    private static String gcdOfTwoStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        for(int i = minLength;i>=1;i--){
            String candidate = str1.substring(0,i);

            if(str1.length() % i ==0 && str2.length() % i == 0){
                if(isDivisable(str1,candidate) && isDivisable(str2,candidate)){
                    return candidate;

                }
            }
        }
        return "";
    }

    private static boolean isDivisable(String str1, String candidate) {

        int times = str1.length() / candidate.length();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<times;i++){
            sb.append(candidate);
        }
        return str1.contentEquals(sb);

    }
}
