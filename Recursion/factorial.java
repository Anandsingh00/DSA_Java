package Recursion;
import java.util.Scanner;
public class factorial {
	public static int factorial(int ans) {
		if(ans==0) {
			return 1;
		}
		else {
			return ans * factorial(ans-1);
		}
		
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int x =factorial(n);
		System.out.println(x);
	}
}
