package Conditionals;
import java.util.Scanner;
public class oddOrEven {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		if(n%2!=0) {
			System.out.println("odd");
		}
		else {
			System.out.println("even");
		}
	}

}
