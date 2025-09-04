package Recursion;
import java.util.Scanner;
public class printParantheses {
	public static void print(int open,int close	,String s ,int n) {
		if( close ==n) {
			System.out.println(s);
		}
		if(open<n) print(open+1,close,s+"(",n);
		if(close<open) print(open,close+1,s+")",n);
	}
		public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		print(0,0,"",n);
	}
}
