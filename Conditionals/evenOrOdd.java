package Conditionals;
import java.util.Scanner;
public class evenOrOdd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = scn.nextInt();
		if(num % 2 == 0) {
			System.out.println(num + " is  a even number.");
		}
		else {
			System.out.println(num + " is a odd number");
		}
	}

}
