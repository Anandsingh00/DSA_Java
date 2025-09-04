package patternPrinting;
import java.util.Scanner;
public class alphabetTriangle {

	public static void main(String[] args) {
		// code for printing triangle in capital alphabets
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i = 1;i <=n;i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
	}

}
