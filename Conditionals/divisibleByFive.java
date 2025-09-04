package Conditionals;
import java.util.Scanner;
public class divisibleByFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//checking whether the input number is divisivle by 5 or not
		if(a%5 == 0) {
			System.out.println("Divisible");
		}
		else {
			System.out.println("Not Divisible");
		}
	}

}
