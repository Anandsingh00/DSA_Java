package Strings;
import java.util.Arrays;

public class StringFunctions {
    static boolean areAnagrams(String st1 , String st2){
        if(st1.length() != st2.length())
            return false;

        char [] a = st1.toCharArray();
        char [] b = st2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }

    static boolean arePalindrome(String s){
        int start = 0, end = s.length()-1;

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static String reverseString(String s){
        StringBuilder rev = new StringBuilder();
        for(int i = s.length()-1; i >= 0 ; i--){
           rev.append(s.charAt(i));
        }
        return rev.toString();
    }
    public static void main(String[]args) {
//        String input = "racecar";
        String s1 = "listen";
        String s2 = "silent";
//        boolean result1 = areAnagrams(s1,s2);
//
//        if(result1){
//            System.out.println("Both the Strings are Anagrams");
//        }else{
//            System.out.println("Not Anagrams");
//          }
//        String s = "racecar";
//
//        boolean result2 = arePalindrome(s);
//
//        if(result2){
//            System.out.println("String is palindrome");
//        }else{
//            System.out.println("String is not a palindrome");
//        }


        String input = "anand";
        String result = reverseString(input);

        System.out.println("Input : " + input + "\nOutput: " + result);

    }
}
