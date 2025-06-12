package org.programs;

public class ReverseOfString {

    public static void main(String[] args) {

        String str = "java is a good programming language";

        reverseString(str);
        reverseStringUsingStringBuilder(str);

        reverseUsingInPlace(str);
    }

    private static void reverseUsingInPlace(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;
        int start = 0;

        for(int i =0;i<=n;i++){
            if(i==n || chars[i] == ' '){
                reverseMethod(chars,start, i-1);
                start = i+1;
            }
        }
        System.out.println(new String(chars));

    }

    private static void reverseMethod(char[] chars, int start, int end) {

        while(start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;

        }

    }

    private static void reverseStringUsingStringBuilder(String s) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        int n = s.length();

        while (i < n){

            while(i <n && s.charAt(i) == ' '){
                res.append(' ');
                i++;
            }

            int start = i;
            while(i<n && s.charAt(i)!=' '){
                i++;
            }

            for(int j = i-1;j>=start;j--){
                res.append(s.charAt(j));
            }
        }
        System.out.println(res.toString());
    }

    private static void reverseString(String s) {

        String str[] = s.split(" ");

        String reverseString ="";
        for(int i =0;i<str.length;i++){
            String word = str[i];
            String nstr = "";
            char ch;
            for(int j =0;j<word.length();j++){
                ch = word.charAt(j);
//                System.out.print("ch values "+ch);
//                System.out.println();
                nstr = ch + nstr;
                System.out.println("nstr values "+nstr);
            }
//            System.out.println(nstr);
            reverseString = reverseString + nstr + " ";
        }
        System.out.println("input string is "+ s);
        System.out.println("ouput string is "+reverseString);
    }
}
