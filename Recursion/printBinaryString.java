package Recursion;

import java.util.Scanner;

public class printBinaryString {
	public static void printString(String s, int n) {
		//PRINT ALL POSSIBLE BINARY STRINGS	
		int m =s.length();
		if(m==n) {
			System.out.println(s);
			return;
		}
		printString(s+0,n);
		printString(s+1,n);
		}
		
	public static void main(String[] args) {
	Scanner	sc = new Scanner(System.in);
	int n = sc.nextInt();
	printString("",n);
	}
}
