package patternPrinting;
import java.util.Scanner;
public class invertedAlphabetTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		for(int i =1 ;i<=n;i++) {
			for(int j = n;j>=i;j--) {
				System.out.print((char)(65-j+n)+ " ");
			}
			System.out.println();
		}
	}

}
