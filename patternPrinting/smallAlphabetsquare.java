package patternPrinting;
import java.util.Scanner;
public class smallAlphabetsquare {
	public static void main(String [] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scn.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= n; j++) {
				System.out.print((char)(j+96)+ " ");
			}
			System.out.println();
		}
	}
}
