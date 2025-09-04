package Strings;
import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter a String: ");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		
		System.out.println("Before reversing: "+sb);
		
		//code for reversing the String
		int n = sb.length();
		
		int i=0;
		int j=n-1;
		while (i <= j) {
			//for swapping characters
			char ch = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, ch);
			i++;
			j--;
		}
		System.out.print("After reversing: "+sb);		
	}
}
