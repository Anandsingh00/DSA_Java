package Basics;
import java.util.Scanner;
public class modulusOperator {
	// code for Even number or odd.
	public static void main(String[] args) {
	System.out.print("Enter a Number: ");
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	
	if(n%2==0) {
		System.out.println("The Number " + n + " is a even number");
	}
	else {
		System.out.println("The Number " + n + " is not a odd number");
	}
	}

}
