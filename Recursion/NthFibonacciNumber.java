package Recursion;
import java.util.Scanner;
public class NthFibonacciNumber {
	public static int fibo(int n) {
		if(n<=1) return n;
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the term: ");
		int n = sc.nextInt();
		int ans = fibo(n);
		System.out.println("the " + n +"th tem is: "+ ans);
	}
}
