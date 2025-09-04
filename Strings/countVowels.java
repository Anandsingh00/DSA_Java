package Strings;
import java.util.Scanner;

public class countVowels {
	public static int count(String s) {
		int count =0;
		for(int i=0;i<s.length();i++){
		char ch = s.charAt(i);
		if(isVowel(ch)==true) {
			count++;
		}
		}
		return count;
	}
	public static boolean isVowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') return true;
		else return false;
	}
	
	
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your text:");
		String s = sc.nextLine();
		int c = count(s);
		System.out.print("Your text contains "+ c+" vowels");
		
	}
}
