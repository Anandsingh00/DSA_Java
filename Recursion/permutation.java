package Recursion;

public class permutation {
	public static void printPermutation(String ans ,String s) {
		if(s.length() ==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			String left = s.substring(0,i);  // will take string from index 0 to i-1
			String right =s.substring(i+1);  //will take string from index i to the last index
			printPermutation(ans+ch,left + right );
				}
		
	}
public static void main(String[]args) {
	String s = "abcd";
	printPermutation("",s);
}
}
