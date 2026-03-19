package Strings;

public class NaivePatternMatching {

    static void naiveSearch(String text,String pattern){
        int n = text.length();
        int m = pattern.length();
        System.out.println("Pattern found at  indices:");

        for(int i = 0 ; i <= n - m; i++){
            int j;
            for(j =0 ; j < m ; j++){
                if(text.charAt(i+j) != pattern.charAt(j))
                    break;
            }
            if(j==m)
                System.out.println(i + " ");
        }
    }
    public static void main(String[] args){
        String text = "abcdefgh";
        String pattern = "kef";
        naiveSearch(text,pattern);
    }
}
