package Recursion;
import java.util.Scanner;
public class stairProblem {
	private static int ways(int n) {
		if(n<=2) return n;
		return ways(n-1)+ ways(n-2);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of stairs:");
	int n= sc.nextInt();
	int ways = ways(n);
	System.out.println("The number of ways are: "+ ways);
}
}
