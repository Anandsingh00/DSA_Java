package Basics;
import java.util.Scanner;
public class SumOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		int x = sc.nextInt();
		System.out.print("Enter the value of y: ");
		int y = sc.nextInt();
		int sum = x+y;
		System.out.print("addition of x and y is: ");
		System.out.print(x+y);

	}

}
