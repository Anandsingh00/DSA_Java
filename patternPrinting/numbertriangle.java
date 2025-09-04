package patternPrinting;
import java.util.Scanner;
public class numbertriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = scn.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
