package Recursion;

import java.util.Scanner;

public class stairProblem2 {
	
	private static int ways(int n) {
		if(n==1 ) return n;
		else if(n==2) return 1;
		else if(n==3) return 2;
		return ways(n-1)+ ways(n-3);

	}
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of stairs:");
	int n= sc.nextInt();
	int ways = ways(n);
	System.out.println("The number of ways are: "+ ways);
}
}
