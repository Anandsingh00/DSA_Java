package Recursion;

import java.util.Scanner;

public class powerCalculation {
	public static int power(int a, int b) { //TC = O(n)
		if (b == 0)
			return 1;
		return a * power(a, b - 1);
	}

	public static int power2(int a, int b) {//TC =log(b)
		if (b == 0)
			return 1;
		int ans = power2(a, b / 2);
		if (b % 2 == 0) {
			return ans * ans;
		} else {
			return ans * ans * a;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base:");
		int a = sc.nextInt();
		System.out.print("Enter power: ");
		int b = sc.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("Not defined");
		} else {
			System.out.println(a + " raised to the power " + b + " is " + power2(a, b));
		}

	}
}
