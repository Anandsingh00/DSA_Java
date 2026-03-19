package Strings;

public class PatternsMatching {
    public static boolean pattern(String s1 , String s2 , int m){
        int n = s1.length();
        for(int i = 0 ; i < n-1-m ; i++){
            int count = 0 ;
            for(int j = 0; j <= m - 1; j++){
                if(s1.charAt(i+j) ==s2.charAt(j)){
                    count++;
                }
                else {
                    break;
                }
            }
            if(count==m){
                return true;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        String s1 = "abcdefghijklmn";
        String s2 = "def";
        Boolean result = pattern(s1,s2,s2.length());

        if(result){
            System.out.println("Pattern found");
        }else{
            System.out.println("Pattern Not Found");
        }
    }
}
