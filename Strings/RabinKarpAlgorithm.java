package Strings;

public class RabinKarpAlgorithm {
    static int simpleHash(String s , int start , int length){
        int hash = 0;
        for(int i = start ; i < start + length ; i++){
            hash += s.charAt(i);
        }
        return hash;
    }
    static void rabinKarp(String text , String pattern){
        int n = text.length();
        int m = pattern.length();

        int patternHash = simpleHash(pattern, 0 , m );
        int textHash = simpleHash(text,0 , m);

        System.out.print("Pattern found at indices: ");

        for(int i = 0 ; i <= n-m ; i++){
            if(patternHash == textHash){
                System.out.println("Pattern matches");
                boolean match = true;
                for(int j = 0; j < m ; j++){
                    if(text.charAt(i+j) != pattern.charAt(j)){
                        match = false;
                        break;
                    }
                }
                if(match){
                    System.out.print(i + " ");
                }
            }

            //slide window - remove first char , add next char
            if(i < n - m){
                textHash = textHash - text.charAt(i) + text.charAt(i+m);
            }
        }
    }
    public static void main(String[]args){
        String text = "abcdefghi";
        String pattern = "ghi";

//        Expected answer : 6
        rabinKarp(text,pattern);
    }
}
