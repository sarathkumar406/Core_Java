package org.LeetCode;



public class StringComparision {
    public static void main(String[] args) {

        char[] chars = {'a','a','b','b','c','c','c'};
      String res = compression(chars);
        System.out.println(res.toString());

        optimalSolutionForCompression(chars);
    }

    private static void optimalSolutionForCompression(char[] chars) {
        int n = chars.length;
        int idx = 0;

        for(int i =0;i<n;i++){
            char ch = chars[i];
            int count  =0;

            while(i < n && chars[i] == ch){
                count++;
                i++;
            }
            chars[idx++] = ch;

            if(count > 1){
                for(char digit : Integer.toString(count).toCharArray()){
                    chars[idx++] = digit;
                }
            }
            i--;
        }
        System.out.println("length of the string is " + idx);
    }

    private static String compression(char[] chars) {
        String str = chars.toString();

        StringBuilder sb = new StringBuilder();

        int count = 1;
        for(int i =1; i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            } else{
                sb.append(str.charAt(i-1)).append(count);
                count  = 1;
            }
        }
        sb.append(str.charAt(str.length()-1)).append(count);
        return sb.length() < str.length() ? sb.toString() : str;
    }
}
